/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edward.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 *
 * @author ext_ealinares
 */
//@JsonIgnoreProperties(ignoreUnknown = true)

public class Results {

    //private Series[] series;
    
    private ArrayList<Series> series;
    
//     public Results() {
//    }

    public ArrayList<Series> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Series> series) {
        this.series = series;
    }

   

  
}
