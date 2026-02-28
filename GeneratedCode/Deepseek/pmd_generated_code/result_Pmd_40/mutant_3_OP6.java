import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }

        // Mutation: Insert unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // do nothing to avoid unreachable statement error
        }
    }

    public void showBug() {
        doSomething();
    }
}