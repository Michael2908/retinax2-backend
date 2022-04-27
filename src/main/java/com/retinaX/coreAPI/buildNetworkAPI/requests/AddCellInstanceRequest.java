package com.retinaX.coreAPI.buildNetworkAPI.requests;

public class AddCellInstanceRequest {
    private Long cellTypeId;
    private double x;
    private double y;


    public AddCellInstanceRequest() {
    }

    public AddCellInstanceRequest(Long cellTypeId){
        setCellTypeId(cellTypeId);
    }

    public Long getCellTypeId() {
        return cellTypeId;
    }

    public void setCellTypeId(Long cellTypeId) {
        this.cellTypeId = cellTypeId;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
