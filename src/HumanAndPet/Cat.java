package HumanAndPet;

public class Cat extends Pet implements PetBehavior {

    public Cat(String name) {
        super(name);
    }


    public void voice () {
        System.out.println("Myauuu");
    }

    @Override
    public void attack() {
        {
            System.out.println("Щарапается и кусается");
        }
    }


    @Override
    public String toString() {
        return  "Кот " + Name ;
    }
}
