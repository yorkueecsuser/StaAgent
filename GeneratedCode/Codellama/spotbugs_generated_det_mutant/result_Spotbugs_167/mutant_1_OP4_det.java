import java.sql.*;

class SQLInjection {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            String query = "SELECT * FROM users WHERE name = '" + args[0] + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (false && false && false && true && false && false && false && true && false && false && false) {float hxygxrgb = -601270382;}else{float assfhlbh = -268126236;}
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