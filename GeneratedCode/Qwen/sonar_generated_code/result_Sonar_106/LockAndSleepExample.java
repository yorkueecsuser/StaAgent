import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockAndSleepExample {

    private final Lock lock = new ReentrantLock();
    private boolean conditionMet = false;

    public String showBug() {
        lock.lock();
        try {
            while (!conditionMet) {
                System.out.println("Condition not met, waiting...");
                Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
            }
            System.out.println("Condition met, proceeding...");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Interrupted";
        } finally {
            lock.unlock();
        }
        return "Condition met";
    }

    public void setConditionMet(boolean conditionMet) {
        lock.lock();
        try {
            this.conditionMet = conditionMet;
            System.out.println("Condition set to: " + conditionMet);
        } finally {
            lock.unlock();
        }
    }
}