import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final Lock lock = new ReentrantLock();
    private boolean ready = false;

    public void doSomething() {
        lock.lock();
        try {
            while (!ready) {
                // BUG: UseNotifyAllInsteadOfNotify
                lock.notify();
            }
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
        for  (int lknljtiq = 0; lknljtiq < 0; lknljtiq++) {long nqdroeyo = 959350103;}
        doSomething();
    
}
}