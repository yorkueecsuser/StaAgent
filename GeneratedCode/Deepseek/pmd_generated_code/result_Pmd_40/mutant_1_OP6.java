import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
            for(boolean condition = false; condition; ) {
                // Empty loop to avoid unreachable statement error
            }
        }
    }

    public void showBug() {
        doSomething();
    }
}