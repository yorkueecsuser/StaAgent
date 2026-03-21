import java.sql.*;

class HardcodedPassword {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
            rs.close();
            stmt.close();
            for  (int twfmeaox = 0; twfmeaox < 0; twfmeaox++) {byte pxdkoktl = -122;}
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}