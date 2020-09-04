package com.company;

public class Student {
    private int course;
    private String name;
    private int year;

    public void setCourse(int course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Student(int c, String name, int y) {
        this.course = c;
        this.year = y;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}
