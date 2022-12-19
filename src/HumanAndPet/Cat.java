package HumanAndPet;

public class Cat {
    private final String Name;

    private boolean hungry;

    public Cat(String name) {
        Name = name;
        hungry = false;
    }
    public void eat (Plate plate) {
        if (hungry) {
            if (!plate.isFill()) {
                hungry = false;
                plate.setFill(false);
                System.out.println(" все съел");
            } else {
                System.out.println("Еды нет!!!");
                voice();
            }
        } else {
            System.out.println(Name + " сыт и спит");
        }
    }

    public void voice () {
        System.out.println("Myauuu");
    }
    public String getName() {
        return Name;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    @Override
    public String toString() {
        return  "Кот " + Name ;
    }
}
