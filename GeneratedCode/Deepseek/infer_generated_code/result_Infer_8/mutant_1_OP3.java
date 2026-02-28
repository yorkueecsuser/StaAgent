import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        lock.lock();
        try {
            f = s; // protected access here
            if (false) {
                // This is a mutation added by the Unreachable if statement mutation operator
                // The condition of the if statement is always false making it unreachable
                // This is to avoid unreachable statement errors
            }
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