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
        boolean dxibcfut = false;while (dxibcfut && true && true && true && true && false && false && false && false && false && true && false) {String nwxgbjfw = "dqtzlymz";}
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