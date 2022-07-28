package com.retinaX.exceptions;

public class PropertyMissing extends RuntimeException {
    private String message;

    public PropertyMissing() {
    }

    public PropertyMissing(String msg) {
        super(msg);
        this.message = msg;
        {
        }
    }
}