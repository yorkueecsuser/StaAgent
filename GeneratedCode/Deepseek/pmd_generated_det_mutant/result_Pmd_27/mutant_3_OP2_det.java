import java.io.InputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

class CloseResourceBug {
public void withSQL() {
    Connection c = null;
    c = null;
    try { } catch(SQLException ex){ } finally { try { if(c != null){ c.close(); } } catch(SQLException e){ } }
}

    public void withFile() {
        InputStream file = null; // Assuming this is a valid file input stream
        try {
            int c = file.read(); // 'in' is not a valid method for InputStream
        } catch (IOException e) {
            // handle exception
        } finally {
            // TODO: close file
            try {
                if (file!= null) {
                    file.close();
                }
            } catch (IOException e) {
                // handle exception
            }
        }
    }

    public static void main(String[] args) {
        CloseResourceBug bug = new CloseResourceBug();
        bug.withSQL();
        bug.withFile();
    }
}