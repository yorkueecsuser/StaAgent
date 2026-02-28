import java.sql.*;

class BuggyPreparedStatement {
    public static void main(String[] args) {
        try {
            // Mutation Operator: Unreachable if-else statement
            // Description: Inserting unreachable if-else branch into a randomly selected basic block in the program.
            // The condition of the inserted branch is always false to make it unreachable.
            boolean condition = false;
            if (condition) {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
                rs.close();
                ps.close();
                conn.close();
            } else {
                // unreachable code
                System.out.println("This code is unreachable");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}