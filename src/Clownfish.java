public class Clownfish extends Percomorpha {

    Clownfish(String breed, int age, String size){
        super(breed, age, size);
    }

    public void makeSound(){
        System.out.println("Pop!");
    }

    public void sleep(){
        System.out.println("Clownfish slept for 8 hours today.")
    }

    public void eat(){
        System.out.println("Clownfish ate a larval shrimp.");
    }

    public void swim(){
        System.out.println("Clownfish swims as a lifestyle.");
    }
}
