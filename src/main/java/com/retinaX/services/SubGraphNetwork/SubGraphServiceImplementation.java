package com.retinaX.services.SubGraphNetwork;

import com.retinaX.coreAPI.buildNetworkAPI.requests.AddSubGraphRequest;
import com.retinaX.coreAPI.buildNetworkAPI.requests.SubGraphFilter;
import com.retinaX.dal.CellInstanceDao;
import com.retinaX.dal.SubGraphDao;
import com.retinaX.entities.CellInstance;
import com.retinaX.entities.Connection;
import com.retinaX.entities.GetSubGraph;
import com.retinaX.entities.SubGraphInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class SubGraphServiceImplementation implements SubGraphService{

    private SubGraphDao sgDao;
    @Autowired
    private CellInstanceDao ciDao;

    @Override
    public void createSubGraph(AddSubGraphRequest request) {
        // Create sub graph object
        // TODO convert the request fully to Sub Graph object
        SubGraphInstance sg = new SubGraphInstance();
//                new Random().nextLong() + 100,
//                request.getName());
        sg.setName(request.getName());
        CellInstance cellInstance = ciDao.findById(request.getCellInstanceID())
                .orElseThrow(() -> new RuntimeException());
        sg.setCell(cellInstance);
        // TODO 2: consider don't give ID to the Sub Graph instance (the db would return it)

        // Saves the sub graph to DB
        SubGraphInstance res = sgDao.save(sg);

        // TODO
        // return res
    }



    @Override
    public SubGraphInstance getSubGraph(String id) {
        // TODO make it prettier
        List<SubGraphInstance> sg = null;
        try{
     //       sg = sgDao.findAllByName(subGraphFilter.getName()).stream().findFirst().orElseThrow();
            sg = sgDao.findAllByName(id);

        }catch(Exception e){
            e.printStackTrace();
        }

        return sg.get(0);
    }

    /*
    @Override
    public SubGraphInstance getSubGraph(Long id) {
        // TODO make it prettier
        SubGraphInstance sg = null;
        try{
            sg = sgDao.findById(id).orElseThrow();


        }catch(Exception e){
            e.printStackTrace();
        }

        return sg;
    }
*/

    @Override
    public List<CellInstance> getCellInstances() {
        //TODO Delete
        return null;
    }

    @Override
    public List<Connection> getConnections() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public void deleteSubGraph(Long id) {

    }

    @Override
    public List<CellInstance> getInputCells() {
        return null;
    }


    @Autowired
    public void setSgDao(SubGraphDao sgDao) {
        this.sgDao = sgDao;
    }
}
