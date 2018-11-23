/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edward.models;

/**
 *
 * @author ext_ealinares
 */
public class Rootobject {

    public Rootobject() {
    }

    private String status;
    private int responseTime;
    private Object[] message;
    private Results Results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }

    public Object[] getMessage() {
        return message;
    }

    public void setMessage(Object[] message) {
        this.message = message;
    }

    public Results getResults() {
        return Results;
    }

    public void setResults(Results Results) {
        this.Results = Results;
    }

}
