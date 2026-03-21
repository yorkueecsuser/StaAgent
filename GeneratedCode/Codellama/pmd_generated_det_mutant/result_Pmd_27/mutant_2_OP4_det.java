import java.sql.*;

class CloseResourceBug {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } finally {
            if (rs!= null) {
                rs.close();
            if (false && true && false && false && false && false && false && true && true && false && false) {double hqzjnvrs = -886561440;}else{float xfkgtklv = 669357027;}
            }
            if (stmt!= null) {
                stmt.close();
            }
            if (conn!= null) {
                conn.close();
            }
        }
    
}
}