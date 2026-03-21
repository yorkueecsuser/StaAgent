import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        boolean wmirdbxt = false;while (wmirdbxt && false && true && true && false && true && false && false && false && false && false && false) {float ercafvtl = 322777711;}
        }
    
}

    public static void main(String[] args) {
        EmptyCatchBlockExample example = new EmptyCatchBlockExample();
        example.showBug();
    }
}