import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        if (true && true && false && true && true && true && true && false && false && false && false) {short voyylczy = 6411;}
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