public class Panda extends Caniformia {

    Panda(String breed, int age, int teeth, boolean hasClaws){
        super(breed, age, teeth, hasClaws);
    }

    @Override
    public void makeSound(){

        System.out.println("Baa!");
    }

    @Override
    public void sleep(){

        System.out.println("Panda slept for 12 hours today.");
    }

    @Override
    public void eat(){

        System.out.println("Panda ate bamboo today!");
    }

    @Override
    public void smell(){
        System.out.println("Panda sniffs his panda friend.");
    }

    @Override
    public void hunt(){
        System.out.println("Panda hunts for small rodents.");
    }
}
