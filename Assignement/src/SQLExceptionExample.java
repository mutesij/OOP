import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:invalid:url");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}

