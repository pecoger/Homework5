public class Animal implements AnimalActions{
    private String name;
    private String breed;
    private int age;
    private boolean hasTail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.trim().isEmpty()){
            this.name = name;
        }else {
            System.out.println("Must have a name!");
        }

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.trim().isEmpty()){
            this.breed = breed;
        }else {
            System.out.println("Must have a breed!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }else {
            System.out.println("Invalid age, please enter valid age!");
        }
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public Animal(String name, String breed, int age, boolean hasTail){
        setName(name);
        setBreed(breed);
        setAge(age);
        setHasTail(hasTail);
    }

    public void printAnimalData(){
        System.out.printf("This is %s, it`s a %s breed and is %d years old. ", name, breed, age);
        if (hasTail){
            System.out.println("It has a tail.");
        }else {
            System.out.println("It does not have tail.");
        }
    }


    @Override
    public void hides() {
        System.out.println(name + " likes to hide.");
    }

    @Override
    public void eats() {
        System.out.println(name + " does not eat pellet food.");
    }

    @Override
    public void plays() {
        System.out.println(name + " does not like to play.");
    }
}
