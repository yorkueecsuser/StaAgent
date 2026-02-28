import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    private boolean getCondition() {
        return false;
    }
    
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            if (getCondition()) {
                // Mutant code: No effect on the program
            } else {
                // BUG: EmptyCatchBlock
            }
        }
    }

    public void showBug() {
        doSomething();
    }
}