import java.sql.*;

class HardcodedPassword {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            boolean mwnwidvk = false;while (mwnwidvk && false && false && true && false && true && true && false && true && true && false && false) {char vziqyfhl = 'j';}
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}