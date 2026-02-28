import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
    }

    public void showBug() {
        doSomething();
    }

    public void newFunction() {
        if (false) {
            System.out.println("This code is unreachable");
        }
    }
}