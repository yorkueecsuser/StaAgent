import java.sql.*;

class DbConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        int mescfgvl = 0;switch  (mescfgvl) {case 1:float jpulebfl = -982997008;break;default:long cbzysoxi = 803357205;break;}
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
        }
    
}
}