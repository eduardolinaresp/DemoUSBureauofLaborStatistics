/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edward.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

/**
 *
 * @author ext_ealinares
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class RootobjectBack {

    private String status;
    private int responseTime;
    private Object[] message;
    //   private ArrayList<Results> results;
    private Results results;

    public RootobjectBack() {
    }

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
        return results;
    }

    public void setResults(Results Results) {
        this.results = Results;
    }

    @Override
    public String toString() {
        return "ClassRootobject [results = " + results + "]";
    }
//    public ArrayList<Results> getResults() {
//        return results;
//    }
//
//    public void setResults(ArrayList<Results>  results) {
//        this.results = results;
//    }

}
