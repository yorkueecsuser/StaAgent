import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String myString;

    public void foo(String s) {
        lock.lock();
        try {
            myString = s; // protected access here
        } finally {
            lock.unlock();
        }
    }

    public String showBug(String s) {
        lock.lock();
        try {
            foo(s);
            return myString;
        } finally {
            lock.unlock();
        }
    }
}