import java.util.ArrayList;

public class Teacher {
    /** Attribute */
    String name;
    int persNo;
    ArrayList<String> courses= new ArrayList<>();

    /** Constructor */
    public Teacher(String name, int persNo){
        this.name= name;
        this.persNo = persNo;
    }

    /** Methods */
    public void changeName(String name){
        this.name= name;
    }

    public void addCourse(String course){
        courses.add(course);
    }
}

