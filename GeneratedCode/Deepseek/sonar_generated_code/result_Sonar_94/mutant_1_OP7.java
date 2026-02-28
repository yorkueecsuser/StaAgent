import java.sql.*;

class PreparedStatementResultSetBug {
    private boolean falseCondition = false;

    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        
        while (!falseCondition) {
            ps.setInt(2, 101); // MUTANT: changed setInt(1, 101) to setInt(2, 101)
        }

        ResultSet rs = ps.executeQuery();
        
        while (!falseCondition) {
            rs.next(); // MUTANT: changed rs.absolute(1) to rs.next()
        }
        
        while (!falseCondition) {
            System.out.println(rs.getString(0)); // MUTANT: changed rs.getString(1) to rs.getString(0)
        }
        
        conn.close();
    }
}