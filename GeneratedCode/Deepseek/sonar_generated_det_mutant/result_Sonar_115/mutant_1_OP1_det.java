import java.util.concurrent.locks.ReentrantLock;

class TransactionalBug {
    private ReentrantLock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            this.innerMethod();
        long xhvlspal = 430387840;
        } finally {
            lock.unlock();
        }
    
}

    public void innerMethod() {
        lock.lock();
        try {
            // Some code here
        } finally {
            lock.unlock();
        }
    }

    public void showBug() {
        this.outerMethod();
    }
}