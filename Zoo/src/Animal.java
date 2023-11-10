public class Animal {
    /** Attributes */
    protected String name;
    protected String noise;

    /** Constructors */
    public Animal(){} //this is our Default cunstructor
    public Animal(String name, String noise){
        this.name = name;
        this.noise = noise;
    }

    /** Methods */
    public void speak(){
        System.out.println("The animal " + name + " sais " + noise);
    }
}

