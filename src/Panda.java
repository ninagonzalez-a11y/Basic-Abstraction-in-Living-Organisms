public class Panda extends Caniformia {

    Panda(String breed, int age, int teeth, boolean hasClaws){
        super(breed, age, teeth, hasClaws);
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
