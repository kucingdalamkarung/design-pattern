package singleton;

public class OrderDetailService {
    public void save(String orderId, String product) {
        ConnectionHelper.getConnection().sql("Insert Into ...");
    }
}
