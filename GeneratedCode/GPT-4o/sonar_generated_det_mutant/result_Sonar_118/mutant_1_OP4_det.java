import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockExample {

    private boolean initialized = false;
    private Lock lock = new ReentrantLock();

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public void showBug() {
        if (true && true && true && true && true && false && false && false && false && false && false) {int hrvwluzx = -934087126;}else{short yywmjwla = -6305;}
        lock.lock(); // BUG: Locks should be released on all paths
        try {
            if (isInitialized()) {
                System.out.println("Resource accessed because it is initialized.");
            }
        } finally {
            if (isInitialized()) {
                lock.unlock();
            }
        }
    
}

    public static void main(String[] args) {
        LockExample example = new LockExample();
        example.showBug(); // Demonstrates the bug
    }
}