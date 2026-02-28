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
        boolean condition;
        try {
            lock.lock();
            if (false) {
                condition.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return currentThread.getState().toString();
    }
}