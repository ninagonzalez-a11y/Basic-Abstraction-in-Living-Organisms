public class Human extends Primates{

    Human(String breed, int age, boolean hasTail, String chestSize){
        super(breed, age, hasTail, chestSize);
    }

    public void makeSound(){
        System.out.println("Hello.");
    }

    public void eat(){
        System.out.println("Human ate cookies today.");
    }

    public void sleep(){
        System.out.println("Human slept for 8 hours today.");
    }

    public void thinks(){
        System.out.println("Human had an existential crisis today.");
    }

    public void socialize(){
        System.out.println("Human attended a church gathering today.");
    }
}
