abstract class Marsupials extends Animal{
    private boolean hasBellyPouch;

    public boolean gethasBellyPouch(){
        return hasBellyPouch;
    }

    public void sethasBellyPouch(hasBellyPouch){
        this.hasBellyPouch = hasBellyPouch;
    }
    abstract void wayOfBirth();
}
