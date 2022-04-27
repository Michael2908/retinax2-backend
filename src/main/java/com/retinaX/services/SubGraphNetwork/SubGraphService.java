package com.retinaX.services.SubGraphNetwork;

import com.retinaX.coreAPI.buildNetworkAPI.requests.AddSubGraphRequest;
import com.retinaX.coreAPI.buildNetworkAPI.requests.ConnectCellsRequest;
import com.retinaX.coreAPI.buildNetworkAPI.requests.SubGraphFilter;
import com.retinaX.entities.*;

import java.util.List;

public interface SubGraphService {

    //TODO: Maybe should return result? (SubGraph)
    void createSubGraph(AddSubGraphRequest request);

    //SubGraphInstance getSubGraph(Long id);

    //SubGraphInstance findByFilter(SubGraphFilter subGraphFilter);
    SubGraphInstance getSubGraph(String subGraph);


        List<CellInstance> getCellInstances();

    //CellInstance connectCells(ConnectCellsRequest connectCellsRequest);

    List<Connection> getConnections();

    void clear();

    void deleteSubGraph(Long id);

    List<CellInstance> getInputCells();

}


