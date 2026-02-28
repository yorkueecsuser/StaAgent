import java.io.FileInputStream;
import java.io.IOException;

class EmptyCatchBlockExample {
    public void doSomething() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }

        boolean unreachableLoopCondition = getUnreachableLoopCondition(); // Newly added mutated code
        while (unreachableLoopCondition) {
            // This code will never be executed because the condition is always false
            System.out.println("This is a never-reachable while loop.");
        }
    }

    public void showBug() {
        doSomething();
    }

    private boolean getUnreachableLoopCondition() { // New method to return the unreachable loop condition
        return false; // The condition is always false, making the while loop unreachable
    }
}