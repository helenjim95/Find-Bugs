package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.Objects;

public class TUMOnline {

    private ArrayList<Course> registeredCourses;
    private ArrayList<Student> enrolledStudents;

    public TUMOnline() {
        registeredCourses = new ArrayList<>();
        enrolledStudents = new ArrayList<>();
    }

    public void enrolStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void registerCourse(Course course) {
        this.registeredCourses.add(course);
    }

    public Student findStudentByName(String forename, String surname) {
        for (Student student : this.enrolledStudents) {
            String studentForename = student.getForename();
            String studentSurname = student.getSurname();
            if (studentForename.equals(forename) && studentSurname.equals(surname)) {
                return student;
            }
        }
        return null;
    }
}
