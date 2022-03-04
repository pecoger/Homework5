public class Dog extends Animal{

    public Dog(String name, String breed, int age, boolean hasTail) {
        super(name, breed, age, hasTail);
    }

    public void bark(){
        System.out.println("Baf Baf");
    }

    @Override
    public void hides() {
        System.out.println(super.getName() + " does not like to hide.");
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " likes to eat everything.");
    }

    @Override
    public void plays() {
        System.out.println(super.getName() + " likes to play.");
    }
}
