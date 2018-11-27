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
public class Results {

    private Series[] series;

    public Results() {
    }

    public Series[] getSeries() {
        return series;
    }

    public void setSeries(Series[] series) {
        this.series = series;
    }
}
