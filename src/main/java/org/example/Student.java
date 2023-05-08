package org.example;

import java.util.Random;
public class Student extends Human implements IGrade{
    private String email;
    private String department;
    private float average;

    public Student(String amka, String fullName, String email, String department) {
        super(amka, fullName);
        this.email=email;
        this.department=department;
        this.average=showAverage();
    }
    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }
    public float getAverage() {
        return average;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public float showAverage() {
        average = (float) (Math.round(Math.random()*100.0)/10.0);
        return average;
    }
}
