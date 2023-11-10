/**
 * Student inherits from PERSON
 * IE it extends the Person class
 *
 * This is called SUB-class
 * (child class)
 */

import java.util.Scanner;

public class Student extends Person {
    /** Attribute*/

    String className;

    /** Constructor */
    public Student(String name, int persNo, String className){
        super(name,persNo);
        this.className = className;
    }

    /** Methods */
    public void changeClass(String className){
        this.className= className;
    }
    public void changeName(String name){
        Scanner myScan= new Scanner(System.in);
        System.out.println("Is " + name + " you new name? (Y/N)");
        String ans= myScan.nextLine();
        if (ans.equalsIgnoreCase("y")){
            this.name = name;
        }
    }

}

