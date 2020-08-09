package factory_method;

public class EmployeeFactory {
    public static Employee createManager(String name) {
        return new Employee(name, "Manager", 10000);
    }

    public static Employee createStaff(String name) {
        return new Employee(name, "Staff", 100);
    }
}
