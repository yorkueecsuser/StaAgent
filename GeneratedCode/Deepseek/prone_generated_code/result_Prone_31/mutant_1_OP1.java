import java.lang.Exception;

class BugExample {
    private Exception deadException;
    private String deadStore;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
        this.deadStore = "deadstore"; // Added a dead store
    }

    public Exception showBug() {
        return this.deadException; // This is the bug line, the exception is created and then never thrown
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}