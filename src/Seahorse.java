public class Seahorse extends Percomorpha {
    Seahorse(String breed, int age, String size){
        super(breed, age, size);
    }

    public void makeSound(){
        System.out.println("Click-click!");
    }

    public void sleep(){
        System.out.println("Seahorse slept for 9 hours today.");
    }

    public void eat(){
        System.out.println("Seahorse ate crustaceans today.");
    }

    public void swim(){
        System.out.println("Seahorse swims forever!");
    }
}
