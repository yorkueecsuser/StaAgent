import java.lang.Exception;

class BugExample {
    private Exception deadException;
    private boolean isExceptionThrown;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
        this.isExceptionThrown = false;
    }

    public Exception showBug() {
        if (!isExceptionThrown) {
            for (int i = 0; false; i++) {
                // The for-loop condition is always false, making it unreachable.
            }
            this.isExceptionThrown = true;
            throw this.deadException;
        }
        return null;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}