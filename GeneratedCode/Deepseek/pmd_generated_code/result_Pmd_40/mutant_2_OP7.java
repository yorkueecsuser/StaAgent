import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
            boolean condition = getCondition(); 
            while (!condition) {
                // unreachable code
                System.out.println("This code is unreachable due to the unreachable while loop mutation.");
            }
        }
    }

    public void showBug() {
        doSomething();
    }

    private boolean getCondition() {
        // This method will always return false to avoid unreachable statement error
        return false;
    }
}