package com.javabrains.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Libin on 1/29/2017.
 */

@Entity
public class Person {

    @Id
    private String id;
    private String fName;
    private String lName;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String id, String fName, String lName, int age, String address) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
