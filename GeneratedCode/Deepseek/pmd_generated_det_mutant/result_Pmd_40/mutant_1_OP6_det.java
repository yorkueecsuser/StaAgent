import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        for  (int eoejmoqr = 0; eoejmoqr < 0; eoejmoqr++) {byte uaibwsyr = -6;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}