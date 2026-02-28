import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
            if (false) {
                System.out.println("MUTANT");
            } else {
                System.out.println("Not a MUTANT");
            }
        }
    }

    public void showBug() {
        doSomething();
    }
}