import java.lang.Exception;

class BugExample {
    private Exception mutatedException; // Mutated variable

    public BugExample() {
        this.mutatedException = new Exception("Dead Exception"); // Mutated line
    }

    public Exception showBug() {
        return this.mutatedException; // This is the bug line, the exception is created and then never thrown
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}