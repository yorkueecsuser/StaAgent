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

    public void showMutant() {
        boolean condition = getCondition(); 
        if (condition) { 
            System.out.println("This is a mutant statement"); 
        } else { 
            System.out.println("This statement is unreachable");
        }
    }

    public boolean getCondition() {
        return false; 
    }
}