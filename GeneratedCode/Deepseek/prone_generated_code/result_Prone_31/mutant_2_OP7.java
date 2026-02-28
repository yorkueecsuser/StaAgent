import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
    }

    public Exception showBug() {
        boolean condition = getCondition();
        while (condition) {
            // This is the newly added unreachable code
        }
        return this.deadException; // This is the bug line, the exception is created and then never thrown
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
    
    private boolean getCondition() {
        return false; // this is the new method to get the condition for the unreachable while loop
    }
}