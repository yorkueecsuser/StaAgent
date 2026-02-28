import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        lock.lock();
        try {
            f = s; // protected access here
            // BUG: GUARDEDBY_VIOLATION
            while (false) {
                // Unreachable while loop
            }
        } finally {
            lock.unlock();
        }
    }

    public String showBug(String s) {
        lock.lock();
        try {
            foo(s);
            while (false) {
                // Unreachable while loop
            }
            return f;
        } finally {
            lock.unlock();
        }
    }
}