package factory_method;

public class Cat implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Meow...");
    }
}
