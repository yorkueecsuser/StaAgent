import java.util.concurrent.locks.ReentrantLock;

class LockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void example_of_bad_pattern() {
        lock.lock();
        try {
            System.out.println("This is a bad pattern");
            // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        lockExample.example_of_bad_pattern();
    }

    // Unreachable if-else statement mutation
    public void unreachableIfElse() {
        lock.lock();
        try {
            System.out.println("This is an unreachable if-else statement mutation");
            if (false) {
                System.out.println("This code is unreachable");
            } else {
                System.out.println("This code is reachable");
            }
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }
}