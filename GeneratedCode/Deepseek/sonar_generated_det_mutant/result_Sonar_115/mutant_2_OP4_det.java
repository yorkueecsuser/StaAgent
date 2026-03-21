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
        if (false && false && true && false && true && false && false && true && true && false && false) {long xmdalwug = -408100926;}else{long fczlwmhq = 531072919;}
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