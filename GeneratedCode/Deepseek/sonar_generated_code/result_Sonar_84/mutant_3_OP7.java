import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final ReentrantLock mon1 = new ReentrantLock();
    private final ReentrantLock mon2 = new ReentrantLock();
    private boolean shouldRun = false; // This ensures the while loop condition is not a compile-time constant

    public void showBug() {
        mon1.lock();
        try {
            mon2.lock();
            try {
                while(shouldRun) { // This is a new unreachable while loop
                    mon2.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mon2.unlock();
            }
        } finally {
            mon1.unlock();
        }
    }
}