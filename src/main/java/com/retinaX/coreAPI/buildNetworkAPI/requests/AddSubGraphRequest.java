package com.retinaX.coreAPI.buildNetworkAPI.requests;

import com.retinaX.entities.CellInstance;

import java.util.ArrayList;

public class AddSubGraphRequest {

    private ArrayList<AddCellInstanceRequest> addCellList;
    private ArrayList<ConnectCellsRequest> connectCellList;
    private ArrayList<CreateCellTypeRequest> createCellTypeList;
    private ArrayList<CreateFunctionRequest> createFunctionList;
    private String name = "SubGraphInstance";
    private Long cellInstanceID;


    public ArrayList<AddCellInstanceRequest> getAddCellList() {
        return addCellList;
    }

    public ArrayList<CreateCellTypeRequest> getCreateCellTypeList() {
        return createCellTypeList;
    }

    public ArrayList<ConnectCellsRequest> getConnectCellList() {
        return connectCellList;
    }

    public ArrayList<CreateFunctionRequest> getCreateFunctionList() {
        return createFunctionList;
    }

    public void setAddCellList(ArrayList<AddCellInstanceRequest> addCellList) {
        this.addCellList = addCellList;
    }

    public void setConnectCellList(ArrayList<ConnectCellsRequest> connectCellList) {
        this.connectCellList = connectCellList;
    }

    public void setCreateCellTypeList(ArrayList<CreateCellTypeRequest> createCellTypeList) {
        this.createCellTypeList = createCellTypeList;
    }

    public void setCreateFunctionList(ArrayList<CreateFunctionRequest> createFunctionList) {
        this.createFunctionList = createFunctionList;
    }

    public AddSubGraphRequest(ArrayList<AddCellInstanceRequest> addCellList, ArrayList<ConnectCellsRequest> connectCellList,
                              ArrayList<CreateCellTypeRequest> createCellTypeList, ArrayList<CreateFunctionRequest> createFunctionList) {
        this.addCellList = addCellList;
        this.connectCellList = connectCellList;
        this.createCellTypeList = createCellTypeList;
        this.createFunctionList = createFunctionList;
    }

    public Long getCellInstanceID() {
        return cellInstanceID;
    }

    public void setCellInstanceID(Long cellInstanceID) {
        this.cellInstanceID = cellInstanceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
