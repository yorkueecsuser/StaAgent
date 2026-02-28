import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final ReentrantLock mon1 = new ReentrantLock();
    private final ReentrantLock mon2 = new ReentrantLock();

    private boolean condition = false; // Mutant addition

    public void showBug() {
        mon1.lock();
        try {
            mon2.lock();
            try {
                if (condition) {
                    mon2.wait(); // BUG: "wait" should not be called when multiple locks are held
                } else {
                    System.out.println("Condition is false, no unreachable code."); // Mutant addition
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