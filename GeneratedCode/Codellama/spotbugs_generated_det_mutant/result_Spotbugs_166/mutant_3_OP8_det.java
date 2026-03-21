import java.sql.*;

class DbConnect {
    public static void main(String[] args) {
        String cbwmhddx = "jdbc:mysql://localhost:3306/test";
        String arjodajp = "root";
        String mvnyijlt = ""; // BUG: Dm: Empty database mvnyijlt (DMI_EMPTY_DB_PASSWORD)

        try {
            Connection conn = DriverManager.getConnection(cbwmhddx, arjodajp, mvnyijlt);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
        }
    }
}