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

    public void example_of_unreachable_if_statement() {
        lock.lock();
        try {
            System.out.println("This is an unreachable if statement");
            if (false) {
                // This code is unreachable
                System.out.println("This statement is unreachable");
            }
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        lockExample.example_of_bad_pattern();
        lockExample.example_of_unreachable_if_statement();
    }
}