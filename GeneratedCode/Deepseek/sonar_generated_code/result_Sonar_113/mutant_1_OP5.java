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
            condition.await(); // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        boolean alwaysFalse = false;
        switch (alwaysFalse) { // This switch statement is meant to be unreachable
            case true:
                break;
            default: // This is the unreachable case
                break;
        }
        
        return currentThread.getState().toString();
    }
}