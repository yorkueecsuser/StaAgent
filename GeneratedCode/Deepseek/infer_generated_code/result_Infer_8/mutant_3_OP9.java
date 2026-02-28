// No mutation can be generated as there are no loops in the provided Java code.
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        lock.lock();
        try {
            f = s; // protected access here
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