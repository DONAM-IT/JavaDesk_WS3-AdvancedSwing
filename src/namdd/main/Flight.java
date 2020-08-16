/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namdd.main;

/**
 *
 * @author Đỗ Nam
 */
public class Flight {
    public String airCode;
    public String from;
    public String to;
    public String option;

    public Flight(String airCode, String from, String to, String option) {
        this.airCode = airCode;
        this.from = from;
        this.to = to;
        this.option = option;
    }

    public String getAirCode() {
        return airCode;
    }

    public void setAirCode(String airCode) {
        this.airCode = airCode;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

   
  
}
