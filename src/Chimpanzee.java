public class Chimpanzee extends Primates{

    private String noseStructure;
    Chimpanzee(String breed, int age, boolean hasTail, String chestSize, String noseStructure){
        super(breed, age, hasTail, chestSize);
        this.noseStructure = noseStructure;
    }

    public String getNoseStructure(){
        return noseStructure;
    }

    public void setNoseStructure(String noseStructure){
        this.noseStructure = noseStructure;
    }

    public void makeSound(){

        System.out.println("Hoo-ha!");
    }

    public void eat(){

        System.out.println("Monkey ate bananas today.");
    }

    public void sleep(){

        System.out.println("Monkey slept for 10 hours today.");
    }

    public void thinks(){

        System.out.println("Monkey got sad because he has no bananas left.");
    }

    public void socialize(){

        System.out.println("Monkey hugged his monkey friend.");
    }

    @Override
    public void thinks() {
        System.out.println("Monkey thinks.");
    }

    @Override
    public void socialize() {
        System.out.println("Monkey socializes.");
    }

}
