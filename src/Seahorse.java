public class Seahorse extends Percomorpha {
    private int swimSpeed;
    Seahorse(String breed, int age, String size, int swimSpeed){
        super(breed, age, size);
        this.swimSpeed = swimSpeed;
    }

    public int getSwimSpeed(){
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed){
        this.swimSpeed = swimSpeed;
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
