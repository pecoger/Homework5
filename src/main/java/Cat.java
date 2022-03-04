public class Cat extends Animal{

    public Cat(String name, String breed, int age, boolean hasTail) {
        super(name, breed, age, hasTail);

    }

    public void drinkMilk(){
        System.out.println("This cat likes to drink milk.");
    }
}