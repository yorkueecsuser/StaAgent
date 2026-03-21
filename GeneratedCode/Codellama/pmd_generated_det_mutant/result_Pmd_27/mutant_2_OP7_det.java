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
            }
            if (stmt!= null) {
                stmt.close();
            boolean qxjchbgz = false;while (qxjchbgz && true && true && true && true && false && true && false && false && true && true && false) {long xivspwnj = -999369390;}
            }
            if (conn!= null) {
                conn.close();
            }
        }
    
}
}