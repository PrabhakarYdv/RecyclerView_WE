package com.prabhakar.recyclerview_we;

public class Student {
    private String name;
    private int age;
    private String rolNo;

    public Student(String name, int age, String rolNo) {
        this.name = name;
        this.age = age;
        this.rolNo = rolNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRolNo() {
        return rolNo;
    }
}
