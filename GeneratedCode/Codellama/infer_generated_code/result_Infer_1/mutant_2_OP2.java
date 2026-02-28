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
}

// Mutant 1: Duplicate the assignment statement "lock.unlock()" in the "try" block

class LockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void example_of_bad_pattern() {
        lock.lock();
        try {
            System.out.println("This is a bad pattern");
            // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
            lock.unlock();
            lock.unlock(); // Mutant 1
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        lockExample.example_of_bad_pattern();
    }
}

// Mutant 2: Duplicate the assignment statement "lock.unlock()" in the "finally" block

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
            lock.unlock(); // Mutant 2
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        lockExample.example_of_bad_pattern();
    }
}