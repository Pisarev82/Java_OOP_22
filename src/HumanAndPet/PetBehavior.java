package HumanAndPet;

public interface PetBehavior {
    /*
    * Тело методов выглядит одиноково и можно было бы только передавать в параметр строку и объединить методы в один,
    * но на самом деле там задуманна сложная и уникальная для каждого из методов логика, которая просто еще не реализованна )))
    * */
    public default void voice() {

        {
            System.out.println("...");
        }
    }

    public  void attack();

}
