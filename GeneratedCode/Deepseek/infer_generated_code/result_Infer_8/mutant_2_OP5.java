import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public String buggyFoo(String s) { // Added new method
        lock.lock();
        try {
            return s; // Unreachable statement
        } finally {
            lock.unlock();
        }
    }

    public void foo(String s) {
        lock.lock();
        try {
            f = buggyFoo(s);
            // BUG: GUARDEDBY_VIOLATION
        } finally {
            lock.unlock();
        }
    }

    public String showBug(String s) {
        lock.lock();
        try {
            foo(s);
            return f;
        } finally {
            lock.unlock();
        }
    }
}