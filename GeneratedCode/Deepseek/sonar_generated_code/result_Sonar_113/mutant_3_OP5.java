import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class Main {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        Thread currentThread = Thread.currentThread();
        try {
            lock.lock();
            condition.await(1, TimeUnit.MILLISECONDS); // Mutated code
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return currentThread.getState().toString();
    }

    public static void unreachableSwitchStatement() {
        int mutant = 1;
        switch (mutant) {
            case 2:
                // Unreachable code
                break;
            case 1:
                // Reachable code
                break;
            default:
                // Unreachable code
                break;
        }
    }
}