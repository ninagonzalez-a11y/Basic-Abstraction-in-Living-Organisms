abstract class Percomorpha extends Animal {
    private String size;

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    abstract void swim();
}
