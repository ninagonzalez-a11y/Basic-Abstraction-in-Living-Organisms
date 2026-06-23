abstract class Primates extends Animal{
    private boolean hasTail;
    private String chestSize;

    Primates(String breed, int age, boolean hasTail, String chestSize){
        super(breed, age)
        this.hasTail = hasTail;
        this.chestSize = chestSize;
    }

    public boolean gethasTail(){
        return hasTail;
    }

    public String chestSize(){
        return chestSize;
    }

    public void sethasTail(){
        this.hasTail = hasTail;
    }

    public void setchestSize(){
        this.chestSize = chestSize;
    }

    public abstract void thinks();
    public abstract void socialize();
}
