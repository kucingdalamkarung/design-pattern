package singleton;

public class OrderService {
    public void save(String orderId) {
        ConnectionHelper.getConnection().sql("INSERT INTO ...");
    }
}
