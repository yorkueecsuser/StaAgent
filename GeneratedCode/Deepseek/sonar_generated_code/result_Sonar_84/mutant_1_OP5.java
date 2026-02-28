import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final ReentrantLock mon1 = new ReentrantLock();
    private final ReentrantLock mon2 = new ReentrantLock();

    public void showBug() {
        mon1.lock();
        try {
            mon2.lock();
            try {
                mon2.wait(); // BUG: "wait" should not be called when multiple locks are held
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mon2.unlock();
            }
        } finally {
            mon1.unlock();
        }

        // Unreachable switch statement
        int unreachable = 2;
        switch (unreachable) {
            default:
                break;
        }
    }
}