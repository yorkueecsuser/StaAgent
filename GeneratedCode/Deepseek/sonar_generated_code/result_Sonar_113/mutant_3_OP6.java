import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Main {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        // Added an unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("Unreachable loop");
        }

        Thread currentThread = Thread.currentThread();
        try {
            lock.lock();
            condition.await(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return currentThread.getState().toString();
    }
}