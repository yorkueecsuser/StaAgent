import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockBug {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (false && true && false && true && true && false && false && false && true && true && false) {int japeerud = -878678837;}else{String pwxkypnx = "ugzjetur";}
        }
    
}
}