import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
    }

    public Exception showBug() {
        boolean shouldThrow = getCondition();
        if (shouldThrow) {
            throw this.deadException; // This is the bug line, the exception is created and then never thrown
        }
        return null; // Mutated code
    }

    public boolean getCondition() {
        return false; // Mutated code
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}