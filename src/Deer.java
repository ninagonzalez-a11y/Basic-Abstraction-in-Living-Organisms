public class Deer extends Ruminantia implements IRuminantia{
    private String antlerShape;

    Deer(String breed, int age, String stomachSize, String headGear, String antlerShape)
    {
        super(breed, age, stomachSize, headGear);
        this.antlerShape = antlerShape;
    }

    public String getAntlerShape(){
        return antlerShape;
    }

    public void setAntlerShape(String antlerShape){
        this.antlerShape = antlerShape;
    }

    public void makeSound(){

        System.out.println("Urp! Urp! Urp!");
    }

    public void eat(){
        System.out.println("Deer ate some leaves and twigs today.");
    }

    public void sleep(){
        System.out.println("Deer slept for 5 hours today.");
    }

    public void digestFood(){
        System.out.println("Deer digests food through rumination.");
    }

    public void chew(){
        System.out.println("Deer chews their cud.");
    }

    @Override
    public void chewCud() {
        System.out.print("Deer chew cud.");
    }

    @Override
    public void regurgitate() {
        System.out.print("Deer regurgitate.");
    }

}
