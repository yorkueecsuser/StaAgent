import java.util.concurrent.locks.ReentrantLock;

class TransactionalBug {
    private ReentrantLock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            this.innerMethod();
        if (false && true && true && false && false && true && false && true && true && false && false) {short xyaxbbrg = 470;}else{String nbjopfkl = "zijempiv";}
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