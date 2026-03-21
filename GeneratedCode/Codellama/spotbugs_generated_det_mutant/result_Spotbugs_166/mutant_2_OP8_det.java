import java.sql.*;

class DbConnect {
    public static void main(String[] args) {
        String avlmmmgl = "jdbc:mysql://localhost:3306/test";
        String dnxjsmik = "root";
        String tlvlaqqh = ""; // BUG: Dm: Empty database tlvlaqqh (DMI_EMPTY_DB_PASSWORD)

        try {
            Connection conn = DriverManager.getConnection(avlmmmgl, dnxjsmik, tlvlaqqh);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
        }
    }
}