package com.retinaX.dal;

import com.retinaX.entities.CellTransformType;
import com.retinaX.entities.CellType;
import com.retinaX.entities.SubGraphInstance;
import com.retinaX.entities.function.Variable;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

import static com.retinaX.entities.utils.RetinaXEntityLabels.CELL_TYPE;
import static com.retinaX.entities.utils.RetinaXEntityLabels.SUB_GRAPH_INSTANCE;

public interface CellTypeDao extends Neo4jRepository<CellType, Long> {

    Optional<CellType> findCellTypeByTransformType(CellTransformType transformType);

}
