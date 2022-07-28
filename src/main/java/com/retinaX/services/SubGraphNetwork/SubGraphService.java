package com.retinaX.services.SubGraphNetwork;

import com.retinaX.coreAPI.buildNetworkAPI.requests.AddSubGraphRequest;
import com.retinaX.entities.*;

import java.util.List;
import java.util.Optional;

public interface SubGraphService {

    //TODO: Maybe should return result? (SubGraph)
    SubGraphInstance createSubGraph(AddSubGraphRequest request);

   // List<SubGraphInstance> getSubGraph(String subGraph);
   List<SubGraphInstance> getSubGraph(Long subGraphId);

    //List<CellInstance> getCellInstances();

    void deleteSubGraphById(Long id);

    List<CellInstance> getInputCells();

    SubGraphInstance cloneSubGraph(Long id);


}