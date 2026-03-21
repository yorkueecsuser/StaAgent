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
        boolean hbvsvjid = false;while (hbvsvjid && false && true && true && true && true && true && true && true && true && false && false) {char uhjtmjlk = 'u';}
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