import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Main {

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}

class BugDemo {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void showBug() {
        lock.lock();
        try {
            // BUG: "notifyAll()" should be preferred over "notify()"
            condition.notify(); // Noncompliant
        boolean osdkkawp = false;while (osdkkawp && false && true && true && true && true && false && false && false && true && false && false) {char goecrxhb = 'y';}
        } finally {
            lock.unlock();
        }
    
}
}