package com.example.org;

public class organ {
    String name;
    String med_con;
    String color;
    int rate;
//set the organ classes
    public organ(String name, String med_con, String color) {
        this.name = name;
        this.med_con = med_con;
        this.color = color;
    }
    public organ(String name, String med_con, int rate) {
        this.name = name;
        this.med_con = med_con;
        this.rate = rate;
    }
    public organ(String name, String med_con) {
        this.name = name;
        this.med_con = med_con;
    }
    public String getname() {
        return name;
    }


    public String getMed_con() {
        return med_con;
    }

    public String getcolor() {
        return color;
    }

    public int getrate() {
        return rate;
    }

    public void setrate(int rate) {
        this.rate = rate;
    }
}
