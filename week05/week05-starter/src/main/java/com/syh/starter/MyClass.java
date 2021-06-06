package com.syh.starter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syh
 */
public class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "MyClass::" + students.toString();
    }
}
