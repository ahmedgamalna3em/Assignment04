package Fourth_Assignment.part1;

import java.util.ArrayList;

public class Student extends Person {

    private int numCourses = 0;
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    public Student(String name, String address, int numCourses) {
        super(name, address);
        this.numCourses = numCourses;
        courses = new ArrayList<>();
        grades = new ArrayList<>();

    }
    /*
    public void addCoursesGrade(String course, String grade) {

    }

    public void PrintGrades() {
    }

    public double getaverageGrade() {
    }
    */

}
