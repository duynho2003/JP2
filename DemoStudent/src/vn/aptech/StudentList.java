/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class StudentList {

    List<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void addStudent(Student stu) {
        students.add(stu);
    }

    public void print() {
        for (Student stu : students) {
            System.out.println(stu);
        }
    }

    public void print2() {
        //students.forEach(s->System.out.println(s));
        students.forEach(System.out::println);
    }

    public List<Student> search(String name) {
        List<Student> result = new ArrayList<>();
        for (Student stu : students) {
            if (stu.getName().contains(name)) {
                result.add(stu);
            }
        }
        return result;
    }
    
    public List<Student> search2(String name) {
        return students.stream()
                .filter(s->s.getName().contains(name))
                .collect(Collectors.toList());
    }
}
