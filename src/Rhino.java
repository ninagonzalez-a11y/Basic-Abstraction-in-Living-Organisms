public class Rhino extends Perissodactyla implements PerissodactylaInterface{
    Rhino(String breed, int age, boolean hasOneHorn, String skinType){
        super(breed, age, hasOneHorn, skinType);
    }

    public void makeSound(){
        System.out.println("Huff!");
    }

    public void eat(){
        System.out.println("Rhinos ate grass today.");

    }

    public void sleep(){
        System.out.println("Rhino slept for 8 hours today.");
    }

    public void grassGrazing(){
        System.out.println("Rhino became a lawnmower today.");
    }

    public void browseOnTrees(){
        System.out.println("Rhino used their lips and strong jaws to strip leaves.");
    }

    @Override
    public void gallop() {
        System.out.print("Rhino gallops");
    }
}
