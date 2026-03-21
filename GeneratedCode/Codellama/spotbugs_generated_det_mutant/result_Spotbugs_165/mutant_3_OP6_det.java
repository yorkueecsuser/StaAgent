import java.sql.*;

class HardcodedPassword {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
            Statement stmt = conn.createStatement();
            for  (int hhdvpmkf = 0; hhdvpmkf < 0; hhdvpmkf++) {String wkuweafh = "hqqzntnr";}
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}