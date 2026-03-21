import java.util.concurrent.locks.ReentrantLock;

class TransactionalBug {
    private ReentrantLock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            this.innerMethod();
        boolean podrbati = false;while (podrbati && false && true && true && true && false && true && false && false && false && true && false) {String gkgpafzq = "wbvetuoe";}
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