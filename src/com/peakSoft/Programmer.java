package com.peakSoft;

import java.time.LocalDate;
import java.util.Scanner;

public class Programmer extends Person{
    private String companyName;

    public Programmer() {

    }

    public Programmer(String name, LocalDate dateOfBirth, String designation, String companyName) {
        super(name, dateOfBirth, designation);
        this.companyName = companyName;
    }

    public  String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nКанча жылдан бери код жазганынды айт: ");
        int year = scanner.nextInt();

        if (year <= 1 ) {
            System.out.print("You are learning coding, so you are just Beginner" );
        } else if ( year <= 2) {
            System.out.print("You are Junior Developer");
        } else {
            System.out.print("You are Senior Developer");
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ",\nAge: " + getAge() + " years old\nDesignation: " + getDesignation()+
                "\nCompany: " + getCompanyName();
    }
}
