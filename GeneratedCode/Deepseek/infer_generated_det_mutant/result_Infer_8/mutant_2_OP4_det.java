import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        if (true && false && true && false && true && true && true && false && true && true && false) {boolean xxpfvadn = false;}else{char fdfxzuvi = 'q';}
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