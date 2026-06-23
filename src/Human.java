public class Human extends Primates{

    private String eyeColor;

    Human(String breed, int age, boolean hasTail, String chestSize, String eyeColor){
        super(breed, age, hasTail, chestSize);
        this.eyeColor = eyeColor;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
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
