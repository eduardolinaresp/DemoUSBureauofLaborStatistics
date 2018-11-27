/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edward.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author ext_ealinares
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Series {
    
    private String seriesID;
    private Datum[] data;

    public Series() {
    }

    public String getSeriesID() {
        return seriesID;
    }

    public void setSeriesID(String seriesID) {
        this.seriesID = seriesID;
    }

    public Datum[] getData() {
        return data;
    }

    public void setData(Datum[] data) {
        this.data = data;
    }
    
}
