package com.company;

import javafx.scene.layout.Priority;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {



    public static void main(String[] args) {
        Student studentOne = new Student(1, "Nail", 26);
        Student studentTwo = new Student(3, "Da", 20);


        Comparator comparator = new StudentYearComparator();
        PriorityQueue<Student> one = new PriorityQueue<Student>(40, new StudentYearComparator());
        one.add(studentOne);
        one.add(studentTwo);
        Comparator comparator1 = new StudentCourseComp();
        PriorityQueue<Student> two = new PriorityQueue<Student>(40,  new StudentCourseComp());
        two.add(studentOne);
        two.add(studentTwo);


        while (one.size() != 0)
        {
            System.out.println(one.remove().toString());
        }

        while (two.size() != 0)
        {
            System.out.println(two.remove().toString());
        }
    }
}


