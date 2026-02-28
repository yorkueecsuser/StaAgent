import java.lang.Exception;

class BugExample {
    private Exception deadException;
    private boolean condition = false; // Unreachable if statement mutant

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); 
    }

    public Exception showBug() {
        if (condition) { // This if branch is unreachable
            return this.deadException; 
        }
        return null;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}