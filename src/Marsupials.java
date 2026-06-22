abstract class Marsupials extends Animal{
    private boolean hasBellyPouch;

    public Marsupials(String breed, int age, boolean hasBellyPouch){
        super(breed, age);
        this.hasBellyPouch = hasBellyPouch;
    }

    public boolean gethasBellyPouch(){
        return hasBellyPouch;
    }

    public void sethasBellyPouch(boolean hasBellyPouch){
        this.hasBellyPouch = hasBellyPouch;
    }
    abstract void birthBaby();
}
