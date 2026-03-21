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
                int mptsfdaa = 0;switch  (mptsfdaa) {case 1:boolean hxsqwizq = false;break;default:short ncwlpxgu = 5662;break;}
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
        CloseResourceBug bug = new CloseResourceBug();
        bug.withSQL();
        bug.withFile();
    }
}