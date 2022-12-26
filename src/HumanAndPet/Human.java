package HumanAndPet;

public class Human {
    private final String Name;

    public Human(String name) {
        Name = name;
    }

    public void CallCat (String petName) {
        System.out.println(petName + " к ноге");
    }

    public void fed (Plate plate) {
        plate.setFill();
        System.out.println("Насыпали корм");
    }

    @Override
    public String toString() {
        if(Name.equals("Николай Владимирович")){
            return "Хороший человек " + Name;
        }
        else {
            return Name;
        }
    }
}
