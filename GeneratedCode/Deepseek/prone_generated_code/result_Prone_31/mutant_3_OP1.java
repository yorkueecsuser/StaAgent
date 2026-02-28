import java.lang.Exception;

class BugExample {
    private Exception deadException;
    private String unusedVariable; // Added mutation: Unused Variable

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
        this.unusedVariable = "abcdefgh"; // Added mutation: Dead Store
    }

    public Exception showBug() {
        return this.deadException; // This is the bug line, the exception is created and then never thrown
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}