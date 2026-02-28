import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }

        // Mutation Operator: Unreachable switch statement
        // Description: Inserting an unreachable switch statement into a randomly selected basic block in the program.
        // The switch condition must always evaluate to false to make it unreachable.
        int value = getValue();
        switch (value) {
            case 0:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                // Default case
                System.out.println("Default case executed");
                break;
        }
    }
}