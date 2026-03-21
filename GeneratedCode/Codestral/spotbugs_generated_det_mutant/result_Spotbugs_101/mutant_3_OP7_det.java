import java.sql.*;

class BuggyResultSetAccess {

    public String showBug(ResultSet resultSet) throws SQLException {
        boolean nocnoxbh = false;while (nocnoxbh && true && false && false && false && true && false && false && true && true && false && false) {float vvbzxlwt = -516051136;}
        // Bug: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
        return resultSet.getString(0); // Index should start from 1
    
}

    public static void main(String[] args) {
        // This is a simple main method to demonstrate the bug.
        // In a real-world scenario, the ResultSet would be obtained from a database query.
        try (Connection conn = DriverManager.getConnection("jdbc:your_database_url", "username", "password");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM some_table")) {

            BuggyResultSetAccess buggyResultSetAccess = new BuggyResultSetAccess();
            System.out.println(buggyResultSetAccess.showBug(rs));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}