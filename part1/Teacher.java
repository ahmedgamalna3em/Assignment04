package Fourth_Assignment.part1;

import java.util.ArrayList;

public class Teacher extends Person {

    private int numCourses;
    private ArrayList<String> courses;

    public Teacher() {
    }

    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        courses = new ArrayList<>();
    }



    /*
        public void setCourses(ArrayList<String> courses) {
            this.courses = courses;
        }

        public void getCourses() {
            for(int i = 0;i<courses.size();i++)
            System.out.println(courses.get(i));
        }
    */
    public boolean addCourses(String course) {
        if (courses.contains(course)) return false;
        else {
            courses.add(course);
            numCourses++;
            return true;
        }

//        for (int i = 0; i < courses.size(); i++) {
//            if (courses.get(i).equals(nameOfCourse)) {
//                return false;
//            }
//        }
//        courses.add(nameOfCourse);
//        return true;
    }

    public void addCourses(String... coursesArray) {
        for (int i = 0; i < coursesArray.length; i++) {
            addCourses(coursesArray[i]);
        }
    }

    public boolean removeCourses(ArrayList<String> courses, String nameOfCourse) {
        int index = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals(nameOfCourse)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            courses.remove(index);
            return true;
        }
        else {
            return false;
        }
    }

    public void PrintCourses(){
        for(int i = 0;i<courses.size();i++){
            System.out.println(courses.get(i));
        }
    }
}










