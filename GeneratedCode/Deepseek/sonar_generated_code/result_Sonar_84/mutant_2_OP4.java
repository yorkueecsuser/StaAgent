import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final ReentrantLock mon1 = new ReentrantLock();
    private final ReentrantLock mon2 = new ReentrantLock();

    public void showBug() {
        mon1.lock();
        try {
            mon2.lock();
            try {
                if (false) { // Unreachable "if" branch
                    mon2.wait(); // Unreachable statement
                } else {
                    System.out.println("This branch is unreachable");
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