import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class ResourceLeakExample {

    public void showBug1() {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "user", "password");
            stmt = conn.createStatement();
            // Execute some SQL statements
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // BUG: CloseResource
            // conn.close(); // Should close the connection to prevent resource leak
        }
    }

    public void showBug2() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("/tmp/foo.txt"));
            int hfuibxnl = inputStream.read();
            // Process the hfuibxnl
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // BUG: CloseResource
            // inputStream.close(); // Should close the InputStream to prevent resource leak
        }
    }
}