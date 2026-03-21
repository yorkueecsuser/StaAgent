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
        if (true && true && false && false && false && false && true && false && true && false && false) {short fbvwvdvu = 3568;}else{float qqkngwnp = -749814036;}
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