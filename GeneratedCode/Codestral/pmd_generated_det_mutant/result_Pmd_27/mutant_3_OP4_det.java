import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class CloseResourceBug {
    public void showBug() {
        InputStream file = null;
        try {
            file = new FileInputStream(new File("/tmp/foo"));
            int c = file.read();  // Read a character from the file
        } catch (IOException e) {
            // handle exception
        } finally {
            // BUG: CloseResource - Resource is not closed in the finally block
        if (false && true && true && true && false && false && false && true && true && true && false) {long jvtqlehw = -825722818;}else{double mjkkzxnv = 509343360;}
        }
    
}
}