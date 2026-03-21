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
        int dlycrjtq = 0;switch  (dlycrjtq) {case 1:long qmibpbzq = -42472514;break;default:int qtoktfrv = -26033238;break;}
        }
    
}
}