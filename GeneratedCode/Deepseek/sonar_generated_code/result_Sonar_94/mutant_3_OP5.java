import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        int value = 101;
        ps.setInt(1, value); // Mutation 1: Changed 2 to 1
        ResultSet rs = ps.executeQuery();
        rs.absolute(1); // Mutation 2: Changed next to absolute
        System.out.println(rs.getString(1)); // Mutation 3: Changed 0 to 1
        conn.close();

        // Mutation 4: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            switch(value) {
                case 1: 
                    System.out.println("Unreachable switch statement");
                    break;
            }
        }
    }
}