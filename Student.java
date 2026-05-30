package com.mycompany.studentmanagementsystem;

public class Student {
    private int id;
    private String name;
    private String course;
    private String yearLevel;

    public Student(int id, String name, String course, String yearLevel) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.yearLevel = yearLevel;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public String getYearLevel() { return yearLevel; }
}
