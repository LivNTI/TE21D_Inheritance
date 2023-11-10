public class Goat extends Animal{

    public Goat(String name, String noise){
        super(name, noise);
    }

    @Override
    public void speak() {
        //super.speak();
        System.out.println("The goat " + name + " sais " + noise);
    }
}
