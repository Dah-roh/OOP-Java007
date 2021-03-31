package model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private int age;
    private String level;
    private String maritalStatus;
    private double salary;


    public Person(String name, int age, String maritalStatus) {
        this.name = name;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    public void setAge(int age) {
        if (age>18){
        this.age = age;
        }
    }
}
