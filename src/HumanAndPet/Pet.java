package HumanAndPet;

public abstract class Pet {
    protected final String Name;

    private boolean hungry;

    public Pet(String name) {
        Name = name;
        hungry = false;
    }
    public void eat (Plate plate) {
        if (hungry) {
            if (!plate.isFill()) {
                hungry = false;
                plate.setEmpty();
                System.out.println(Name + " все съел");
            } else {

                System.out.println("Еды нет!!!");
            }
        } else {
            System.out.println(Name + " сыт и спит");
        }
    }

    public String getName() {
        return Name;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    @Override
    public String toString() {
        return  "Животное " + Name ;
    }
}

