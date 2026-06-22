abstract class Panda extends Animal {

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
}
