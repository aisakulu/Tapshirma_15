package com.peakSoft;

import java.time.LocalDate;

public class Singer extends Person {
    private String bandName;

    public Singer() {

    }

    public Singer(String name, LocalDate dateOfBirth, String designation, String bandName) {
        super(name, dateOfBirth, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println("Singing");
    }
    public void playGuitar() {
        System.out.println("Playing guitar is my lifestyle");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ",\nAge: " + getAge() + " years old\nDesignation: " + getDesignation()+
                "\nBand Name: " + getBandName();
    }
}
