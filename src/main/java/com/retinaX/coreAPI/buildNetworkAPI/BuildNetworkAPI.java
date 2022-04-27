package com.retinaX.coreAPI.buildNetworkAPI;

import com.retinaX.coreAPI.buildNetworkAPI.requests.AddSubGraphRequest;
import com.retinaX.coreAPI.buildNetworkAPI.requests.AddCellInstanceRequest;
import com.retinaX.coreAPI.buildNetworkAPI.requests.ConnectCellsRequest;
import com.retinaX.coreAPI.buildNetworkAPI.requests.CreateCellTypeRequest;
import com.retinaX.entities.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;


public interface BuildNetworkAPI {
    CellType createCellType(CreateCellTypeRequest createCellTypeRequest);
     public int createSubGraph(@RequestBody AddSubGraphRequest addBlockRequest);
    CellInstance addCellInstance(AddCellInstanceRequest addCellInstanceRequest);

    CellInstance connectCells(ConnectCellsRequest connectCellsRequest);

    Map<String, Boolean> areCompatible(CellTransformType srcTransformType, CellTransformType destTransformType);

    CellType getCellType(Long id);

    List<CellType> getCellTypes();

    CellInstance getCellInstance(Long id);

    List<CellInstance> getCellInstances();

    List<CellInstance> getInputCells();

    List<Connection> getAllConnections();

   // SubGraphInstance getSubGraph(Long id);

        void updateCellCoordinates(CellInstance cellInstance, double x, double y);

    void deleteCellType(Long id);

    void deleteCellInstance(Long id);

    void deleteConnection(Long id);

}
