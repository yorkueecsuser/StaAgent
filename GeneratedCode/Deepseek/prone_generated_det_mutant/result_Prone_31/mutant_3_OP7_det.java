import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        boolean hokqppjm = false;while (hokqppjm && true && false && true && true && false && false && true && true && false && true && false) {char rgjhbgjz = 'z';}
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
    
}

    public Exception showBug() {
        return this.deadException; // This is the bug line, the exception is created and then never thrown
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}