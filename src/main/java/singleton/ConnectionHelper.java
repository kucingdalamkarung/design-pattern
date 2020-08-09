package singleton;

public class ConnectionHelper {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            connection = new Connection("localhost", "root", "password");
        }
        return connection;
    }
}
