public class Seal extends Caniformia{

    Seal(String breed, int age, int teeth, boolean hasClaws){
        super(breed, age, teeth, hasClaws);
    }
    @Override
    public void makeSound(){

        System.out.println("Urgh!");
    }

    @Override
    public void sleep(){

        System.out.println("Seal slept for 10 hours today.");
    }

    @Override
    public void eat(){

        System.out.println("Seal ate fish today!");
    }

    @Override
    public void smell(){
        System.out.println("Seal sniffs her daughter seal.");
    }

    @Override
    public void hunt(){
        System.out.println("Seal hunts for squid.");
    }


}


