import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String a; // Mutated variable name from 'f'

    public void foo(String s) {
        lock.lock();
        try {
            a = s; // protected access here
            // BUG: GUARDEDBY_VIOLATION
        } finally {
            lock.unlock();
        }
    }

    public String showBug(String s) {
        lock.lock();
        try {
            foo(s);
            return a; // return statement returns mutated variable name
        } finally {
            lock.unlock();
        }
    }
}