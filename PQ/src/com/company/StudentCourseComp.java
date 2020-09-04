package com.company;

import java.util.Comparator;

public class StudentCourseComp implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCourse() < s2.getCourse())
            return 1;
        else if (s1.getCourse() > s2.getCourse())
            return -1;
        return 0;
    }
}
