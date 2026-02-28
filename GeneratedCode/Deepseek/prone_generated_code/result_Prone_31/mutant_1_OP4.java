import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
    }

    public Exception showBug() {
        if (false) { // mutant
            System.out.println("This code will never be executed");
        } else {
            return this.deadException; // This is the bug line, the exception is created and then never thrown
        }
        return this.deadException;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}