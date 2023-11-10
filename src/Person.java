/**
 * Teacher & student inherits FROM this class
 * This is called a SUPER-class
 * (Parent class)
 *
 */
public class Person {
    /** Attribute */
    String name;
    int persNo;

    /** Constructor */
    public Person(){ // Default Constructor

    }
    public Person(String name, int persNo){
        this.name= name;
        this.persNo = persNo;
    }

    /** Methods */
    public void changeName(String name){
        this.name= name;
    }
}
