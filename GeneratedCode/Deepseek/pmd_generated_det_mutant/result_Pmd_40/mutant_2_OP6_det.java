import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        for  (int wyfpskef = 0; wyfpskef < 0; wyfpskef++) {float qvfylzsc = -853641948;}
        }
    
}

    public void showBug() {
        doSomething();
    }
}