abstract class Ruminantia extends Animal {
    private String stomachSize;
    private String headGear;

    Ruminantia(String breed, int age, String stomachSize, String headGear){
        super(breed, age);
        this.stomachSize = stomachSize;
        this.headGear = headGear;
    }

    public String getstomachSize(){
        return stomachSize;
    }

    public String getheadGear(){
        return headGear;
    }

    public void setstomachSize(String stomachSize){
        this.stomachSize = stomachSize;
    }

    public void setheadGear(String headGear){
        this.headGear = headGear;
    }

    abstract void digestFood();
    abstract void chew();
}
