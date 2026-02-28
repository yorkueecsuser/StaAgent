import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final ReentrantLock mut1 = new ReentrantLock();
    private final ReentrantLock mut2 = new ReentrantLock();

    public void showBug() {
        mut1.lock();
        try {
            mut2.lock();
            try {
                mut2.wait(); // BUG: "wait" should not be called when multiple locks are held
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mut2.unlock();
            }
        } finally {
            mut1.unlock();
        }
    }
}