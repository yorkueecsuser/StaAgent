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
        int txnpioir = 0;switch  (txnpioir) {case 1:long qvitvptd = -778597052;break;default:boolean ylceolrw = true;break;}
        CloseResourceBug bug = new CloseResourceBug();
        bug.withSQL();
        bug.withFile();
    
}
}