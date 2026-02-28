import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }

        // Mutant 1: Unreachable if-else statement
        if (false) {
            // Unreachable code
            System.out.println("Unreachable code executed");
        } else {
            // Reachable code
            System.out.println("Reachable code executed");
        }
    }
}