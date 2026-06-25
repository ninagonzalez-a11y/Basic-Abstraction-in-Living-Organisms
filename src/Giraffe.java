public class Giraffe extends Ruminantia implements RuminantiaInterface{

    private int patchNumber;
    Giraffe(String breed, int age, String stomachSize, String headGear, int patchNumber){
        super(breed, age, stomachSize, headGear);
        this.patchNumber = patchNumber;
    }

    public int getPatchNumber(){
        return patchNumber;
    }

    public void setPatchNumber(int patchNumber){
        this.patchNumber = patchNumber;
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

    @Override
    public void chewCud() {
        System.out.print("Giraffe chew cud.");
    }

    @Override
    public void regurgitate() {
        System.out.print("Deer regurgitate.");
    }

}
