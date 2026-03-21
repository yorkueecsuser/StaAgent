import java.util.concurrent.locks.ReentrantLock;

class TransactionalBug {
    private ReentrantLock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            this.innerMethod();
        if (false && true && true && true && true && true && false && false && false && false && false) {float fujniqdm = 27172539;}
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