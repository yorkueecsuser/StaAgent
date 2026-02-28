import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }

    // Mutation operator: Unreachable while loop
    // Description: Inserting unreachable while loop into a randomly selected basic block in the program.
    // The condition of the inserted loop is always false to make it unreachable.
    public void showMutated() {
        boolean condition = getCondition();
        while (condition) {
            System.out.println("Unreachable code executed");
        }
    }

    // Helper method to generate a condition for the while loop
    private boolean getCondition() {
        return false;
    }
}