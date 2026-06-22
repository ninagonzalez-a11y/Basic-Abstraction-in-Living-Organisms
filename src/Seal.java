public class Seal extends Caniformia{

    Seal(String breed, int age, int teeth, boolean hasClaws){
        super(breed, age, teeth, hasClaws);
    }
    public void makeSound(){

        System.out.println("Urgh!");
    }

    public void sleep(){

        System.out.println("Seal slept for 10 hours today.");
    }

    public void eat(){

        System.out.println("Seal ate fish today!");
    }

    public void smell(){
        System.out.println("Seal sniffs her daughter seal.");
    }

    public void hunt(){
        System.out.println("Seal hunts for squid.");
    }


}


