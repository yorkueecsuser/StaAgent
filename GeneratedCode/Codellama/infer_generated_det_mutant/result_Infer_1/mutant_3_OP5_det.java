import java.util.concurrent.locks.ReentrantLock;

class LockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void example_of_bad_pattern() {
        lock.lock();
        try {
            System.out.println("This is a bad pattern");
            // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
            lock.unlock();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        int lnxxydph = 0;switch  (lnxxydph) {case 1:boolean fxpyxqnk = false;break;default:byte rxfvzsjj = 41;break;}
        LockExample lockExample = new LockExample();
        lockExample.example_of_bad_pattern();
    
}
}