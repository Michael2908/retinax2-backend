package com.retinaX.entities.function;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static com.retinaX.entities.utils.RetinaXEntityLabels.FUNCTION;
import static com.retinaX.entities.utils.RetinaXRelationshipTypes.FUNCTION_VARS;

@NodeEntity(label = FUNCTION)
public class Function {
    @Id
    @GeneratedValue
    private Long id;
    private String expression;


    @Relationship(type = FUNCTION_VARS)
    private Set<Variable> variables;


    public Function(){
        variables = new HashSet<>();
    }

    public Function(String expression, Set<Variable> variables){
        setExpression(expression);
        this.variables = variables;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Set<Variable> getVariables() {
        return variables;
    }

    public int getNumberOfVariables(){
        return variables.size();
    }

    public void setVariables(Set<Variable> variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Function function = (Function) o;
        return id.equals(function.id)
                && expression.equals(function.expression) &&
                variables.containsAll(function.variables) && function.variables.containsAll(variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, expression, variables);
    }

    @Override
    public String toString() {
        return super.toString() +" Function{" +
                "id=" + id +
                ", expression='" + expression + '\'' +
                ", variables=" + variables +
                '}';
    }
}
