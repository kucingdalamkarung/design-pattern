package factory_method;

public class App {
    public static void main(String[] args) {
        Employee manager = EmployeeFactory.createManager("Eko");
        Employee manager2 = EmployeeFactory.createManager("Rudy");
        Tiger tiger = (Tiger) AnimalFacotry.create("tiger");
        assert tiger != null;
        tiger.speak();
    }
}
