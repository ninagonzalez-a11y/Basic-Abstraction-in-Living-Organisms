public class Panda extends Caniformia {

    private String color;

    Panda(String breed, int age, int teeth, boolean hasClaws, String color){
        super(breed, age, teeth, hasClaws);
        this.color = color;
    }

    public String getColor(){
        return color;

    }

    public void setColor(String color){
        this.color = color;
    }

    public void makeSound(){

        System.out.println("Baa!");
    }

    public void sleep(){

        System.out.println("Panda slept for 12 hours today.");
    }

    public void eat(){

        System.out.println("Panda ate bamboo today!");
    }

    public void smell(){
        System.out.println("Panda sniffs his panda friend.");
    }

    public void hunt(){
        System.out.println("Panda hunts for small rodents.");
    }
}
