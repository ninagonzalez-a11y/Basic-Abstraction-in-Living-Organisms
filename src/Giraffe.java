public class Giraffe extends Ruminantia{
    Giraffe(String breed, int age, String stomachSize, String headGear){
        super(breed, age, stomachSize, headGear);
    }

    public void makeSound(){
        System.out.println("Hum..");
    }

    public void eat(){
        System.out.println("Giraffe ate some acacia tree today.");
    }

    public void sleep(){
        System.out.println("Giraffe slept for 30 minutes today.");
    }

    public void digestFood(){
        System.out.println("Giraffe digests food through rumination.");
    }

    public void chew(){
        System.out.println("Giraffe chews food with their long tongues and tough lips.");
    }
}
