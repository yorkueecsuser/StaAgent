import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        lock.lock();
        do {
            f = s; // protected access here
            // BUG: GUARDEDBY_VIOLATION
        } while (false);
        lock.unlock();
    }

    public String showBug(String s) {
        lock.lock();
        do {
            foo(s);
            return f;
        } while (false);
        lock.unlock();
    }
}