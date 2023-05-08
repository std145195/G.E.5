package org.example;

public class Student extends Human {
    private String email;
    private String department;

    public Student(String amka, String fullName, String email, String department) {
        super(amka, fullName);
        this.email=email;
        this.department=department;
    }

}
