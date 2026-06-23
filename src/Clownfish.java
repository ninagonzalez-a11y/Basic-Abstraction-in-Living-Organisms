public class Clownfish extends Percomorpha implements IPercomorpha{

    private String pattern;

    Clownfish(String breed, int age, String size, String pattern){
        super(breed, age, size);
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void makeSound(){
        System.out.println("Pop!");
    }

    public void sleep(){
        System.out.println("Clownfish slept for 8 hours today.");
    }

    public void eat(){
        System.out.println("Clownfish ate a larval shrimp.");
    }

    @Override
    public void swim() {
        System.out.print("Clownfish swims.");

    }

    @Override
    public void dive() {
        System.out.print("Clownfish dives");
    }

}
