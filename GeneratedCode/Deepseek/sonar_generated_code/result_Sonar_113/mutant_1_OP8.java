import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Main {
    private static ReentrantLock myLock = new ReentrantLock();
    private static Condition myCondition = myLock.newCondition();

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        Thread currentThread = Thread.currentThread();
        try {
            myLock.lock();
            myCondition.await(); // The bug is still present because the generated mutated Java code is still using the original variable names
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            myLock.unlock();
        }
        return currentThread.getState().toString();
    }
}