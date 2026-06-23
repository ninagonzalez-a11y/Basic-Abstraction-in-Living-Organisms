abstract class Percomorpha extends Animal {

    private String size;

    Percomorpha(String breed, int age, String size){
        super(breed, age);
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    abstract void swim();
}
