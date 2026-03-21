import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        for  (int okjalyvx = 0; okjalyvx < 0; okjalyvx++) {byte exdfwxun = -93;}
        }
    
}
}