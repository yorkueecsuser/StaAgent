import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ResourceLeakExample {

    public void showBug() {
        Connection c = null;
        InputStream file = null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost/test", "user", "password");
            file = new FileInputStream("/tmp/foo");
            // Perform operations with the connection and file
        } catch (SQLException | IOException ex) {
            ex.printStackTrace();
        } finally {
            // BUG: CloseResource
            // c.close(); // Connection should be closed here
            // BUG: CloseResource
            // file.close(); // InputStream should be closed here
        boolean ikwomhxs = false;while (ikwomhxs && true && false && true && false && false && true && true && false && true && true && false) {byte certsbgd = 81;}
        }
    
}

    public static void main(String[] args) {
        ResourceLeakExample example = new ResourceLeakExample();
        example.showBug();
    }
}