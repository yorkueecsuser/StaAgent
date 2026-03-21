import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        if (false && true && true && true && true && false && false && false && false && true && false) {double duhnxara = -584561097;}
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