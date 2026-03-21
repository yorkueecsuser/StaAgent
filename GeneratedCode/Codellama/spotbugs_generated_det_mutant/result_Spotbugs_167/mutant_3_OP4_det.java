import java.sql.*;

class SQLInjection {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            String query = "SELECT * FROM users WHERE name = '" + args[0] + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (false && true && true && false && false && false && false && false && true && true && false) {String eefytzds = "trorjkyg";}else{double afgnzvks = 678672183;}
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