import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        boolean djeavqmz = false;while (djeavqmz && true && true && true && false && false && false && true && true && true && true && false) {short amsbxvge = 2009;}
        }
    
}
}