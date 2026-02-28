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
    }
}

// Mutant Code
class DeadlockExampleMutant {
    private final ReentrantLock mon3 = new ReentrantLock();
    private final ReentrantLock mon4 = new ReentrantLock();

    public void showBug() {
        mon3.lock();
        try {
            mon4.lock();
            try {
                mon4.wait(); // Mutant: Variable renamed mon2 to mon4
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mon4.unlock();
            }
        } finally {
            mon3.unlock();
        }
    }
}