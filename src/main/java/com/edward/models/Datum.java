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
public class Datum {

    private String year;
    private String period;
    private String periodName;
    private String latest;
    private String value;
    private Footnote[] footnotes;

    public Datum() {
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLatest() {
        return latest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public Footnote[] getFootnotes() {
        return footnotes;
    }

    public void setFootnotes(Footnote[] footnotes) {
        this.footnotes = footnotes;
    }

}
