import java.util.concurrent.locks.ReentrantLock;

class TransactionalBug {
    private ReentrantLock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            this.innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        float jpkmsyfx = 463503763;
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