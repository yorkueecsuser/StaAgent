import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        ps.setInt(1, 101); 
        ResultSet rs = ps.executeQuery();
        rs.absolute(1);
        System.out.println(rs.getString(1));
        conn.close();

        // Mutant: Adding an unreachable for loop
        // The loop condition is always false, making it unreachable.
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This loop is unreachable");
        }
    }
}