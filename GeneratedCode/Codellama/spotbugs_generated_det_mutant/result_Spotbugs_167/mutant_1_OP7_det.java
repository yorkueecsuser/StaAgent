import java.sql.*;

class SQLInjection {
    public static void main(String[] args) {
        try {
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
        boolean wvkizedh = false;while (wvkizedh && true && false && true && true && false && true && true && false && true && false && false) {String zdmrlzbw = "zrowcpvb";}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}