package Fourth_Assignment.part1;


public class Task01 {

    public static void main(String[] args) {
        Person p1 = new Person("Ahmed", "15 may");
        System.out.println(p1.toString());
        Teacher t1 = new Teacher("Mr.Akram", "Garden City");
        t1.addCourses("C++");
        t1.addCourses("C#");
        String[] arr = {"", ""};
        t1.addCourses(arr);
        t1.addCourses("", "");

        t1.PrintCourses();
        Teacher t2 = new Teacher("Eng.Ibrahim","AlAhram");
        System.out.println(t2.toString());
    }
}