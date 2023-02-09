package com.example.basicrestexampleinspring;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    //Singleton Pattern - 3 steps
    private static StudentList inst = null;

    private StudentList() {
        stList = new ArrayList<>();
    }

    public static StudentList getInstance() {
        if (inst == null) {
            inst = new StudentList();
        }
        return inst;
    }
    //end of singleton pattern

    private List<Student> stList;

    public void AddStudent(Student s) {
        stList.add(s);
    }



    public Student GetStudent(int id) {
        if (stList.size() <= id || id < 0) {
            return null;
        }
        return stList.get(id);
    }

    public List<Student> GetStudentList() {
        return stList;
    }
}
