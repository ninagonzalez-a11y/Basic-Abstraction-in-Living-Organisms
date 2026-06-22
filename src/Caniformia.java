abstract class Caniformia extends Animal {
    private int teeth;
    private boolean hasClaws;

    public int getTeeth(){
        return teeth;
    }

    public boolean gethasClaws(){
        return hasClaws;
    }

    public void setTeeth(int teeth){
        this.teeth = teeth;
    }

    public void sethasClaws(boolean hasClaws){
        this.hasClaws = hasClaws;
    }

    abstract void smell();
    abstract void hunt();
}
