import java.sql.*;

class DbConnect {
    public static void main(String[] args) {
        String cemczudb = "jdbc:mysql://localhost:3306/test";
        String qmsmtiwt = "root";
        String cuygbveg = ""; // BUG: Dm: Empty database cuygbveg (DMI_EMPTY_DB_PASSWORD)

        try {
            Connection conn = DriverManager.getConnection(cemczudb, qmsmtiwt, cuygbveg);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
        }
    }
}