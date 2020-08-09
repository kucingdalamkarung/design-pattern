package factory_method;

public class AnimalFacotry {
    public static IAnimal create(String type) {
        if (type == "tiger") return new Tiger();
        else if (type == "cat") return new Cat();
        else if (type == "dog") return new Dog();

        return null;
    }
}
