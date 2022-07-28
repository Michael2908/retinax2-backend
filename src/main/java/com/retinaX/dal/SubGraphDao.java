package com.retinaX.dal;

import com.retinaX.entities.*;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.retinaX.entities.utils.RetinaXEntityLabels.*;
import static com.retinaX.entities.utils.RetinaXRelationshipTypes.*;

public interface SubGraphDao extends Neo4jRepository<SubGraphInstance, Long> {

    @Query
            ("MATCH (p:SubGraphInstance) "+
                    "WHERE p.name = $subGraphName "+
                    "CALL apoc.path.subgraphAll(p,{}) "+
                    "YIELD nodes, relationships "+
                    "RETURN nodes, relationships;"
            )
    List<SubGraphInstance> findAllByName(@Param("subGraphName") String name);


    @Query
            ("MATCH p=(type:"+SUB_GRAPH_INSTANCE+")-[*]-() "+
                    "WHERE type.id=$subGraphName "+
                    "RETURN p"
            )
    SubGraphInstance findById(@Param("id") String name);


    @Query
            ("MATCH (p:SubGraphInstance) "+
            "WHERE id(p) = $subGraphId "+
            "CALL apoc.path.subgraphAll(p,{}) "+
            "YIELD nodes, relationships "+
            "RETURN nodes, relationships;"
            )
        List<SubGraphInstance> findAllById(@Param("subGraphId") Long id);


    @Query
            ("MATCH (p)"+
                    "WHERE id(p)=$subGraphId "+
                    "CALL apoc.path.subgraphNodes(p, {}) "+
                    "YIELD node "+
                    "detach delete node"
            )
    void deleteById(@Param("subGraphId") Long id);

}
