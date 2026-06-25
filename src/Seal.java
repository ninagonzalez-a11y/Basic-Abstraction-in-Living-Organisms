public class Seal extends Caniformia implements CaniformiaInterface{

    private boolean hasEarFlaps;

    Seal(String breed, int age, int teeth, boolean hasClaws){
        super(breed, age, teeth, hasClaws);
        this.hasEarFlaps = hasEarFlaps;
    }

    public boolean gethasEarFlaps(){
        return hasEarFlaps;
    }

    public void sethasEarFlaps(boolean hasEarFlaps){
        this.hasEarFlaps = hasEarFlaps;
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

    @Override
    public void roar() {
    }

    @Override
    public void hunt() {
        System.out.println("Seal hunts for squid.");
    }

}


