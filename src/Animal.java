public abstract class Animal {
    private String breed;
    private int age;

    public Animal (String breed, int age){
        this.breed = breed;
        this.age = age;
    }

    public String getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setAge(int age){
        if(age>=0){
            this.age = age;
        }
        else{
            System.out.println("This is invalid!");
        }
    }
    public abstract void makeSound();
    public abstract void sleep();
    public abstract void eat();
}
