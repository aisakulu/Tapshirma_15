package com.peakSoft;

import java.time.LocalDate;

public class Dancer extends Person {
    private String groupName;

    public Dancer() {

    }

    public Dancer(String name, LocalDate dateOfBirth, String designation, String groupName) {
        super(name, dateOfBirth, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println("Dancing");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ",\nAge: " + getAge() + " years old\nDesignation: " + getDesignation()+
                "\nGroup Name: " + getGroupName();
    }
}
