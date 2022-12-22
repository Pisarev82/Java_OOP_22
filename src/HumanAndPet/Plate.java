package HumanAndPet;

public class Plate {
    private boolean isFill = true;

    public boolean isFill() {
        return isFill;
    }

    public void setFill() {
        this.isFill = false;
    }

    public void setEmpty() {
        this.isFill = true;
    }

}
