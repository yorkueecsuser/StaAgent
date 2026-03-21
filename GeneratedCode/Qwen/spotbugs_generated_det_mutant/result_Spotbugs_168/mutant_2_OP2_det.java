import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class SqlInjectionExample {

    // Method to demonstrate the bug
public PreparedStatement showBug(String userInput)throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test" , "user" , "password");
    String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
    PreparedStatement pstmt = conn.prepareStatement(query);
    pstmt = conn.prepareStatement(query);
    return pstmt;
}

    public static void main(String[] args) {
        try {
            SqlInjectionExample example = new SqlInjectionExample();
            PreparedStatement pstmt = example.showBug("admin' --");
            System.out.println("Prepared Statement: " + pstmt.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}