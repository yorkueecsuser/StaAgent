import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); 
        this.deadException = new Exception("Dead Exception"); // Mutation 1: Duplication
    }

    public Exception showBug() {
        return this.deadException; 
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}