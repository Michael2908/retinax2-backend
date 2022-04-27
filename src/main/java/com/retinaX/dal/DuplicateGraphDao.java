package com.retinaX.dal;

import com.retinaX.entities.CellInstance;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static com.retinaX.entities.utils.RetinaXEntityLabels.CELL_INSTANCE;
import static com.retinaX.entities.utils.RetinaXEntityLabels.CELL_TYPE;
import static com.retinaX.entities.utils.RetinaXRelationshipTypes.FROM_TYPE;
import static com.retinaX.entities.utils.RetinaXEntityLabels.SUB_GRAPH_INSTANCE;


public interface DuplicateGraphDao extends Neo4jRepository<CellInstance, Long> {
    @Query("CALL gds.beta.graph.create.subgraph('{newGraph}','{oldGraph}','*','*')")
    List<CellInstance> duplicateGraphFromExisting(@Param("oldGraph") String oldGraph ,@Param("newGraph") String newGraph);


}


