import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock

            // Mutant Code: Unreachable Switch Statement
            int mutant = 0;
            switch (mutant) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
                default:
                    break;
            }
        }
    }

    public void showBug() {
        doSomething();
    }
}