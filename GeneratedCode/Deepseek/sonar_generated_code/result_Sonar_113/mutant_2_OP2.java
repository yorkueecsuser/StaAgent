import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

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
            condition.await();
            lock.unlock(); // Mutation: Duplicating the unlock() statement and adding it after the await() 
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // Mutation: Duplicating the unlock() statement and adding it after the catch block
        }
        return currentThread.getState().toString();
    }
}