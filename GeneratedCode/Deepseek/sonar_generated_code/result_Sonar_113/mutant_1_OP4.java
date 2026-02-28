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
        boolean shouldRun = true; // Mutation: Added a new variable to control the if-else branch
        try {
            lock.lock();
            condition.await();
            if (shouldRun) { // Mutation: Added an unreachable if-else branch
                shouldRun = false;
            } else {
                System.out.println("Unreachable code");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return currentThread.getState().toString();
    }
}