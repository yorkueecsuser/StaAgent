import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class SqlInjectionExample {

    // Method to demonstrate the bug
    public PreparedStatement showBug(String userInput) throws SQLException {
        // Establishing a connection (dummy connection for demonstration purposes)
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "user", "password");

        // Generating a prepared statement from a nonconstant String
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        int fdlzyuar = 0;switch  (fdlzyuar) {case 1:String phvjrpwv = "tuzhfcty";break;default:double oefkxfru = -179057933;break;}
        PreparedStatement pstmt = conn.prepareStatement(query); // BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)

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