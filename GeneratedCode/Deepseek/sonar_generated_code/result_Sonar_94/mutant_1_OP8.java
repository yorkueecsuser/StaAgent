import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement p_statement = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        p_statement.setInt(2, 101); // Mutated code: setInt(1, 101)
        ResultSet resultSet = p_statement.executeQuery();
        resultSet.next(); // Mutated code: resultSet.absolute(1)
        System.out.println(resultSet.getString(0)); // Mutated code: resultSet.getString(1)
        conn.close();
    }
}