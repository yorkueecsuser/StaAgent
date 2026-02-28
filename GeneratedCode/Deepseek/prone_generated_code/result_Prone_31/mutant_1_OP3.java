import java.lang.Exception;

class BugExample {
    private Exception deadException;

    public BugExample() {
        this.deadException = new Exception("Dead Exception"); // BUG: DeadException
    }

    public Exception showBug() {
        if (false) {
          try {
            // This is the mutant line, the exception is created and then never thrown
            throw this.deadException;
          } catch (Exception e) {
            // Handle the exception
          }
        }
        return this.deadException;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}