public class Student {
    /** Attribute*/
    String name;
    int persNo;
    String className;

    /** Constructor */
    public Student(String name, int persNo, String className){
        this.name= name;
        this.persNo = persNo;
        this.className = className;
    }

    /** Methods */
    public void changeName(String name){
        this.name= name;
    }

    public void changeClass(String className){
        this.className= className;
    }
}

