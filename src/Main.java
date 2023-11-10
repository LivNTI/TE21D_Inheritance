import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello School!");

        Student s = new Student("Josh", 123456,"TE21E");
        System.out.println(s.name + " class is " + s.className);
        s.changeName("Jonathan");



        Teacher t= new Teacher("David", 76543);
        t.addCourse("Matte");
        System.out.println(t.name + " has first cours "+ t.courses.get(0));
        t.changeName("Hanna");
        System.out.println(t.name + " has first cours "+ t.courses.get(0));


    }
}