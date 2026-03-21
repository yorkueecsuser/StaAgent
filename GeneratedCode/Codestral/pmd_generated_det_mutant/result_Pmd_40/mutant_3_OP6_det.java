import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        for  (int nwzfcgqo = 0; nwzfcgqo < 0; nwzfcgqo++) {double xylsyzwl = 765566160;}
        }
    
}
}