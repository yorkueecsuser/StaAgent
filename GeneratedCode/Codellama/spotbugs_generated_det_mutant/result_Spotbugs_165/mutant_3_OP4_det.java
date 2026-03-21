import java.sql.*;

class HardcodedPassword {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            if (false && true && false && true && true && true && false && true && false && true && false) {char qjybopjh = 'r';}else{long ceeuslon = 725693941;}
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}