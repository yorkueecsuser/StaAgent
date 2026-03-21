import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        for  (int mbtxpjbj = 0; mbtxpjbj < 0; mbtxpjbj++) {long lzvwkrsq = -235069075;}
        }
    
}
}