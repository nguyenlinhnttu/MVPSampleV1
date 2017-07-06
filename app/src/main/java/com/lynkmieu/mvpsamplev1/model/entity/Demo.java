package com.lynkmieu.mvpsamplev1.model.entity;

/**
 * Created by kentdzai on 12/03/2017.
 */

public class Demo {
    private String message;

    public Demo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "message='" + message + '\'' +
                '}';
    }
}
