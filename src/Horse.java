public class Horse extends Perissodactyla implements PerissodactylaInterface{
    Horse(String breed, int age, boolean hasOneHorn, String skinType){
        super(breed, age, hasOneHorn, skinType);
    }

    public void makeSound(){
        System.out.println("Neigh!");
    }

    public void eat(){
        System.out.println("Horse ate hay today.");

    }

    public void sleep(){
        System.out.println("Horse slept for 5 hours today.");
    }

    public void grassGrazing(){
        System.out.println("Horse use their sharp teeth to snip grass");
    }

    public void browseOnTrees(){
        System.out.println("Horse ate leaves and chewed twigs.");
    }

    @Override
    public void gallop() {
        System.out.print("Horse gallops");
    }
}