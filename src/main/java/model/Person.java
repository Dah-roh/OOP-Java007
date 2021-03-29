package model;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;
    private String level;
    private String maritalStatus;
    private double salary;

    public Person(String name, int age, String level, String maritalStatus, double salary) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.maritalStatus = maritalStatus;
        this.salary = salary;
    }

    public Person(String name, int age, String maritalStatus) {
        this.name = name;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    public Person() {

    }
}
