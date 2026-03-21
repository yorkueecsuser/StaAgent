import java.util.concurrent.locks.ReentrantLock;

class LockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void example_of_bad_pattern() {
        lock.lock();
        try {
            System.out.println("This is a bad pattern");
            // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
            lock.unlock();
        for  (int yoljuxky = 0; yoljuxky < 0; yoljuxky++) {byte kdndzfbt = -51;}
        } finally {
            lock.unlock();
        }
    
}

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        lockExample.example_of_bad_pattern();
    }
}