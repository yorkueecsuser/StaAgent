import java.sql.*;

class CloseResourceBug {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        boolean vcwyjqbo = false;while (vcwyjqbo && true && false && true && false && true && false && false && false && false && true && false) {byte aisgagrm = -37;}
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