public class Test {
    public static void main(String[] args) {

    Cat cat1 = new Cat("Pisi", "mixed", 3, true);
    cat1.printAnimalData();
    cat1.drinkMilk();
    cat1.eats();
    cat1.hides();
    cat1.plays();

    System.out.println("-------------");

    Dog dog1 = new Dog("Aris", "cocker spaniel", 2, false);
    dog1.printAnimalData();
    dog1.bark();
    dog1.eats();
    dog1.hides();
    dog1.plays();
    }

}
