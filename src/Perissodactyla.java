abstract class Perissodactyla extends Animal {
    private boolean hasOneHorn;
    private String skinType;

    Perissodactyla(String breed, int age, boolean hasOneHorn, String skinType) {
        super(breed, age);
        this.hasOneHorn = hasOneHorn;
        this.skinType = skinType;
    }

    public boolean gethasOneHorn() {
        return hasOneHorn;
    }

    public String getskinType() {
        return skinType;
    }

    public void sethasOneHorn(boolean hasOneHorn) {
        this.hasOneHorn = hasOneHorn;
    }

    public void setskinType(String skinType) {
        this.skinType = skinType;
    }

        abstract void grassGrazing ();
        abstract void browseOnTrees ();

    }

