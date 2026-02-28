import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
            FileInputStream fisCopy = new FileInputStream("/tmp/bugger"); // Mutated line
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
    }

    public void showBug() {
        doSomething();
    }
}