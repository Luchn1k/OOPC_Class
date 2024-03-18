import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
    private static JDBCConnection instance;

    private final String URL = "jdbc:mysql://localhost:3306/my_database";
    private final String username = "root";
    private final String password = "1234";

    private Connection connection;

    private JDBCConnection() {
        try {
//            com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(URL, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public synchronized static JDBCConnection getInstance() {
        if (instance == null)
            instance = new JDBCConnection();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }


}



