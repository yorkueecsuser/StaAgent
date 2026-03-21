import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (true && true && true && true && true && true && false && true && false && true && false) {char ayjmzipr = 'j';}
        }
    
}
}