package com.retinaX.coreAPI.buildNetworkAPI.requests;

import com.retinaX.entities.CellTransformType;

public class CreateCellTypeRequest {
    private String name;
    private CellTransformType transformType;
    private CreateFunctionRequest createFunctionRequest;

    public CreateCellTypeRequest(){

    }

    public CreateCellTypeRequest(String name, CellTransformType transformType, CreateFunctionRequest createFunctionRequest) {
        setName(name);
        setTransformType(transformType);
        setCreateFunctionRequest(createFunctionRequest);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CellTransformType getTransformType() {
        return transformType;
    }

    public void setTransformType(CellTransformType transformType) {
        this.transformType = transformType;
    }

    public CreateFunctionRequest getCreateFunctionRequest() {
        return createFunctionRequest;
    }

    public void setCreateFunctionRequest(CreateFunctionRequest createFunctionRequest) {
        this.createFunctionRequest = createFunctionRequest;
    }
}
