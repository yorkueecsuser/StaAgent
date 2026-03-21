import java.sql.*;

class SQLInjection {
    public static void main(String[] args) {
        try {
            for  (int cdcltoia = 0; cdcltoia < 0; cdcltoia++) {byte ecwowdad = -89;}
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            String query = "SELECT * FROM users WHERE name = '" + args[0] + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}