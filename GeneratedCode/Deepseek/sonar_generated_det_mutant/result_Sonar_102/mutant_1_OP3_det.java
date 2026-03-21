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
            if (false && true && true && true && false && false && false && true && false && false && false) {int evwetosc = 625915707;}
            // BUG: "notifyAll()" should be preferred over "notify()"
            condition.notify(); // Noncompliant
        } finally {
            lock.unlock();
        }
    
}
}