import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // Original code
    }

    public Exception showBug() {
        return this.deadException; // Original code
    }

    public void unreachableCodeMutant() {
        int value = getValue();
        switch (value) {
            default:
                break;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
        bugExample.unreachableCodeMutant();
    }

    // Additional non-final variable and method to prevent compile-time constants from being directly used
    private int getValue() {
        return 0;
    }
}