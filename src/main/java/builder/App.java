package builder;

public class App {
    public static void main(String[] args) {
        CustomerBuilder builder = new CustomerBuilder();
        builder.setId(1)
                .setAddress("bandung")
                .setEmail("asd@gmail.com")
                .setFirstName("asd")
                .setLastName("asdasd")
                .setPhone("123")
                .build();
    }
}
