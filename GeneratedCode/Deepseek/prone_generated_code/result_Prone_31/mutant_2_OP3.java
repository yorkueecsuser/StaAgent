import java.lang.Exception;

class BugExample {
    private Exception deadException;
    private boolean shouldThrowException;

    public BugExample() {
        this.deadException = new Exception("Dead Exception");
        this.shouldThrowException = false; // Mutant code: Changing the condition of an if statement to always be false
    }

    public Exception showBug() {
        if(shouldThrowException) {
            return this.deadException;
        }
        return null; // Mutant code: Adding a return statement that is unreachable if the condition of the if statement is false
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}