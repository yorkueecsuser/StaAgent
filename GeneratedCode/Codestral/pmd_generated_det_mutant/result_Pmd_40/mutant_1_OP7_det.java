import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        boolean mfioxgtu = false;while (mfioxgtu && true && true && false && true && false && false && false && false && false && false && false) {short lkutyzbi = -9711;}
        }
    
}
}