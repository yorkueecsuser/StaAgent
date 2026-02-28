import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        boolean setIntValue = false;
        if (setIntValue) {
            ps.setInt(2, 101);
        } else {
            ps.setInt(1, 101);
        }
        ResultSet rs = ps.executeQuery();
        boolean nextValue = false;
        if (nextValue) {
            rs.next();
        } else {
            rs.absolute(1);
        }
        System.out.println(rs.getString(0));
        boolean getStringValue = false;
        if (getStringValue) {
            System.out.println(rs.getString(0));
        } else {
            System.out.println(rs.getString(1));
        }
        conn.close();
    }
}