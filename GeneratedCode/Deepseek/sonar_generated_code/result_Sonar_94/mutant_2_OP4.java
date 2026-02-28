import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        ps.setInt(2, 101); 
        ResultSet rs = ps.executeQuery();
        rs.next(); 
        // Addition of unreachable if-else statement
        if(false) {
            System.out.println("Unreachable statement");
        } else {
            System.out.println(rs.getString(0)); 
        }
        conn.close();
    }
}