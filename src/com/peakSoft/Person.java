package com.peakSoft;

import java.time.LocalDate;

public class Person {
    private String name;
    private byte age;
    private LocalDate dateOfBirth;
    private String designation;

    public Person () {

    }

    public Person(String name, LocalDate dateOfBirth, String designation) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.designation = designation;
        this.age = (byte) (LocalDate.now().getYear() - dateOfBirth.getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learn() {
        System.out.println("Learn");
    }

    public void walk() {
        System.out.println("Walk");
    }

    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", designation='" + designation + '\'' +
                '}';
    }
}
