import java.io.InputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

class CloseResourceBug {
    public void withSQL() {
        Connection c = null; // Assuming this is a valid connection object
        try {
            // do stuff
        } catch (SQLException ex) {
            // handle exception
        } finally {
            // oops, should close the connection using 'close'!
            try {
                if (c!= null) {
                    c.close();
                }
            } catch (SQLException e) {
                // handle exception
            }
        }
    }
public void withFile() {
    InputStream file = null;
    file = null;
    try { int c = file.read(); } catch(IOException e){ } finally { try { if(file != null){ file.close(); } } catch(IOException e){ } }
}

    public static void main(String[] args) {
        CloseResourceBug bug = new CloseResourceBug();
        bug.withSQL();
        bug.withFile();
    }
}