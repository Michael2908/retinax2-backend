package com.retinaX.entities;
import org.neo4j.ogm.annotation.*;
import org.opencypher.v9_0.ast.FromGraph;

import static com.retinaX.entities.utils.RetinaXEntityLabels.*;
import static com.retinaX.entities.utils.RetinaXRelationshipTypes.FROM_GRAPH;

@NodeEntity(label = SUB_GRAPH_INSTANCE)
public class SubGraphInstance {

  //  LinkedList<CellInstance> cells;

    @Id
    @GeneratedValue
    private Long id;

    private String name = "";

//    @Relationship(type = FROM_TYPE, direction = Relationship.UNDIRECTED)
    // List<Connection> connectionList;
   @Relationship(type = FROM_GRAPH)
   private CellInstance cell;

    private CellTransformType transformType;


//    @Relationship(type = CELL_TYPE_FUNCTION)
//    private Function function;
    public SubGraphInstance(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public SubGraphInstance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CellInstance getCell() {
        return cell;
    }

    public void setCell(CellInstance cell) {
        this.cell = cell;
    }
    /* private void setTransformType(CellTransformType transformType) {
        this.transformType = transformType;
    }

    public CellTransformType getTransformType() {
        return transformType;
    }*/



 /*   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubGraphInstance that = (SubGraphInstance) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(Cells, that.Cells) && transformType == that.transformType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Cells, transformType);
    }
*/
    //    public void setFunction(Function function) {
//        this.function = function;
//    }
//
//    public Function getFunction() {
//        return function;
//    }
//
//    public int getNumberOfInputs() {
//        return function.getNumberOfVariables();
//    }
//
//    public CellTransformType.Type getInputType(){
//        return transformType.getInput();
//    }
//
//    public CellTransformType.Type getOutputType(){
//        return transformType.getOutput();
//    }

//    @Override
//    public String toString() {
//        return "CellType{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", transformType=" + transformType +
//                ", function=" + function +
//                '}';
//    }

    @Override
    public String toString() {
        return "SubGraphInstance{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cell=" + cell +
                '}';
    }
}




