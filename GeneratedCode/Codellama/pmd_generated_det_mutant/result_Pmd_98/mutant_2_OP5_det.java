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
        int bjsnramk = 0;switch  (bjsnramk) {case 1:float ilkqgtki = -778887531;break;default:boolean tcxemtbn = false;break;}
        setReady(ready);
        doSomething();
    
}
}