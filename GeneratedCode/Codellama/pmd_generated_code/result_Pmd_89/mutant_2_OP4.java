import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }

        // Mutant: Unreachable if-else statement
        if (getCondition()) {
            System.out.println("Unreachable code executed");
        } else {
            System.out.println("Unreachable code skipped");
        }
    }

    private boolean getCondition() {
        return false;
    }
}