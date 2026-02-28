import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }

    // Unreachable switch statement mutant
    public void showBugMutant() {
        // ALWAYS ensure that the condition of any control structure (`if`, `while`, `for`, `switch`) is dynamically determined at runtime.
        int value = getValue();
        switch(value) {
            case 0: // Unreachable statement
                System.out.println("Unreachable code executed");
                break;
            case 1: // Normal code
                System.out.println("Normal code executed");
                break;
            default: // Default case
                System.out.println("Default code executed");
                break;
        }
    }

    // Method to get a value for the switch statement
    private int getValue() {
        // Randomly return either 0 or 1
        return new Random().nextInt(2);
    }
}