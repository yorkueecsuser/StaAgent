import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (true && false && false && false && true && false && true && false && false && false && false) {boolean vjdeepfj = true;}else{long tzzramhj = -759187466;}
        }
    
}
}