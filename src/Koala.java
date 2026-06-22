public class Koala extends Marsupials {

    Koala(String breed, int age, boolean hasBellyPouch){
        super(breed, age, hasBellyPouch);
    }
    public void makeSound(){
        System.out.println("EEEE-ugh!");
    }
    public void sleep(){
        System.out.println("Koala slept for 22 hours today.");
    }
    public void eat(){
        System.out.println("Koala ate gum leaves today.");
    }
    public void birthBaby(){
        System.out.println("Koala gives birth to a joey.");
    }
}
