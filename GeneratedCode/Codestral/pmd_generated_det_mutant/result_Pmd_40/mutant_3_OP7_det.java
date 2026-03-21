import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        boolean omghkhvq = false;while (omghkhvq && false && false && true && false && false && false && true && true && true && false && false) {float khawxaud = 328307345;}
        }
    
}
}