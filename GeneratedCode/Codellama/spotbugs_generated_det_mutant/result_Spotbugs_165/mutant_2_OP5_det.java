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
            int kacctwpb = 0;switch  (kacctwpb) {case 1:long khuntabh = 922565288;break;default:short hpmszprg = -1321;break;}
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}