import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
    }

    public Exception showBug() {
        return this.deadException; // This is the bug line, the exception is created and then never thrown
    }

    public Exception mutant1() {
        boolean mutation = false;
        if (mutation) {
            return this.deadException;
        } else {
            return new Exception("Mutant Exception");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
        bugExample.mutant1();
    }
}