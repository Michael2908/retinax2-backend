package com.retinaX.coreAPI.buildNetworkAPI.requests;

import com.retinaX.entities.CellInstance;

public class ConnectCellsRequest {

    private CellInstance sourceCell;
    private CellInstance destinationCell;
    private int delay;
    private String inputFunctionVariable;

    public ConnectCellsRequest() {
    }

    public ConnectCellsRequest(CellInstance sourceCell, CellInstance destinationCell, String inputFunctionVariable, int delay) {
        setSourceCell(sourceCell);
        setDestinationCell(destinationCell);
        setInputFunctionVariable(inputFunctionVariable);
        setDelay(delay);
    }

    public ConnectCellsRequest(CellInstance sourceCell, CellInstance destinationCell, String inputFunctionVariable) {
        this(sourceCell, destinationCell, inputFunctionVariable, 0);
    }

    public CellInstance getDestinationCell() {
        return destinationCell;
    }

    public void setDestinationCell(CellInstance destinationCell) {
        this.destinationCell = destinationCell;
    }

    public String getInputFunctionVariable() {
        return inputFunctionVariable;
    }

    public void setInputFunctionVariable(String inputFunctionVariable) {
        this.inputFunctionVariable = inputFunctionVariable;
    }

    public CellInstance getSourceCell() {
        return sourceCell;
    }

    public void setSourceCell(CellInstance sourceCell) {
        this.sourceCell = sourceCell;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
