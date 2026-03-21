import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {

    public void showBug() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        if (false && true && true && false && false && false && true && false && true && true && false) {double rrtkmqoq = 232993735;}else{float wafzfkqh = 461840923;}
        }
    
}

    public static void main(String[] args) {
        EmptyCatchBlockExample example = new EmptyCatchBlockExample();
        example.showBug();
    }
}