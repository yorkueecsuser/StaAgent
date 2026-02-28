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

/*
Mutant 1: Unreachable if-else statement
Original code:
    lock.lock();
    try {
        System.out.println("This is a bad pattern");
        // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        lock.unlock();
    } finally {
        lock.unlock();
    }

Mutated code:
    lock.lock();
    try {
        System.out.println("This is a bad pattern");
        // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        lock.unlock();
    } finally {
        if (false) {
            lock.unlock();
        } else {
            lock.unlock();
        }
    }
*/