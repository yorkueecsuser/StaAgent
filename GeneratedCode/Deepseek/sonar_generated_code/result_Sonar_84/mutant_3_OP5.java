import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private final ReentrantLock mon1 = new ReentrantLock();
    private final ReentrantLock mon2 = new ReentrantLock();

    public void showBug() {
        mon1.lock();
        try {
            mon2.lock();
            try {
                mon2.wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mon2.unlock();
            }
        } finally {
            mon1.unlock();
        }

        // Start of the added mutant code
        switch(getCondition()) {
            case 1:
                // Do nothing
                break;
            case 2:
                // Do nothing
                break;
            default:
                // Do nothing
        }
        // End of the added mutant code
    }

    private int getCondition() {
        return 3; // This ensures that the switch statement is always false
    }
}