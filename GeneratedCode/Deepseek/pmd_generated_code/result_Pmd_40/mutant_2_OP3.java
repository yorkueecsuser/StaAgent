import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock - This is the original code.

            // Mutant code - This code is added to ensure that the catch block is unreachable.
            if (false) {
                System.out.println("This will never be executed");
            }
        }
    }

    public void showBug() {
        doSomething();
    }
}