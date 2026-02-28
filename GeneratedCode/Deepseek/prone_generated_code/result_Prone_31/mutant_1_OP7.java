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
        
        int unreachableWhileValue = 1; // Mutation Operator: Unreachable While Loop
        while (unreachableWhileValue < 1) {
            System.out.println("Unreachable while loop mutant");
            unreachableWhileValue++;
        }
        
        bugExample.showBug();
    }
}