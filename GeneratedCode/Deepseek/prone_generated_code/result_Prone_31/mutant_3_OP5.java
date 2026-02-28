import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
    }

    public Exception showBug() {
        return this.deadException; // This is the bug line, the exception is created and then never thrown
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();

        // Mutant code begins:
        boolean deadCondition = false;
        if (deadCondition) {
            Exception deadException = new Exception("Mutant Exception");
            deadException.printStackTrace();
        }
        // Mutant code ends
    }
}