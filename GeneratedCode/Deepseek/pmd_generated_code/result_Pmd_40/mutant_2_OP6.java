import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock

            // Mutant Code
            for (int i = 0; getConditionFor(); i++) {
                // Non reachable
            }
        }
    }

    public void showBug() {
        doSomething();
    }

    // Helper Method
    public boolean getConditionFor() {
        return false;
    }
}