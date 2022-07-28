package com.retinaX.services.SubGraphNetwork;

import com.retinaX.coreAPI.buildNetworkAPI.requests.AddSubGraphRequest;
import com.retinaX.dal.CellInstanceDao;
import com.retinaX.dal.SubGraphDao;
import com.retinaX.entities.*;
//import com.retinaX.services.utils.CloneManager;
import com.retinaX.services.buildNetwork.BuildNetworkService;
import com.retinaX.services.utils.CloneManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SubGraphServiceImplementation implements SubGraphService{

    @Autowired
    private BuildNetworkService cellDao;

    private SubGraphDao sgDao;
    @Autowired
    private CellInstanceDao ciDao;

    @Override
    public SubGraphInstance createSubGraph(AddSubGraphRequest request) {
        // Create sub graph object
        // TODO convert the request fully to Sub Graph object
        SubGraphInstance sg = new SubGraphInstance();
        sg.setName(request.getName());
        Iterable<CellInstance> allById = ciDao.findAllById(request.getCellInstanceID());
        List<CellInstance> cellInstancesResult = new ArrayList();
//        allById.forEach(cellInstancesResult::add);
//        sg.setCells(cellInstancesResult);

        for(CellInstance cell: allById){
            if(cell.getCellType().getTransformType() != CellTransformType.INPUT_TO_ANALOG){
                throw new RuntimeException("PLEASE CONNECT THE RIGHT INPUT!");
            }else{
                cellInstancesResult.add(cell);
                sg.setCells(cellInstancesResult);
            }
        }

        // TODO 2: consider don't give ID to the Sub Graph instance (the db would return it)
        //  SubGraphInstance res = sgDao.save(sg);
        // Saves the sub graph to DB
        SubGraphInstance subGraphInstance = sgDao.save(sg);
        return subGraphInstance;

    }

@Override
public List<SubGraphInstance> getSubGraph(Long id) {
    // TODO make it prettier
    List<SubGraphInstance> sg = null;
    try{
        sg = sgDao.findAllById(id);

    }catch(Exception e){
        e.printStackTrace();
    }

    return sg;

}


    @Override
    public SubGraphInstance cloneSubGraph(Long id) {
        // singleton that manages the clone
        Optional<SubGraphInstance> sg =sgDao.findById(id);
        String name = sg.get().getName();

        SubGraphInstance sgInstance = sgDao.findAllByName(name).get(0);

        CloneManager.reset();
        SubGraphInstance clonedSubGraphInstance = sgInstance.clone();
        sgDao.save(clonedSubGraphInstance);
        return clonedSubGraphInstance;
    }


    @Override
    public void deleteSubGraphById(Long id) {
      List<SubGraphInstance>sg= sgDao.findAllById(id);
       sgDao.deleteById(sg.get(0).getId());
    }

    @Override
    public List<CellInstance> getInputCells() {
        return cellDao.getInputCells();
    }


    @Autowired
    public void setSgDao(SubGraphDao sgDao) {
        this.sgDao = sgDao;
    }
}
