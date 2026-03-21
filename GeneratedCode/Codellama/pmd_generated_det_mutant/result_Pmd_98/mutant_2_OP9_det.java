import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final Lock lock = new ReentrantLock();
    private boolean ready = false;

    public void doSomething() {
        lock.lock();
        try {
            do {
                // BUG: UseNotifyAllInsteadOfNotify
                lock.notify();
            } while (!ready);
        } finally {
            lock.unlock();
        }
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean isReady() {
        return ready;
    }

    public void showBug(boolean ready) {
        setReady(ready);
        doSomething();
    }
}