public class Deer extends Ruminantia {
    Deer(String breed, int age, String stomachSize, String headGear){
        super(breed, age, stomachSize, headGear);
    }

    public void makeSound(){
        System.out.println("Urp! Urp! Urp!");
    }

    public void eat(){
        System.out.println("Deer ate some leaves and twigs today.");
    }

    public void sleep(){
        System.out.println("Deer slept for 5 hours today.");
    }

    public void digestFood(){
        System.out.println("Deer digests food through rumination.");
    }

    public void chew(){
        System.out.println("Deer chews their cud.");
    }
}
