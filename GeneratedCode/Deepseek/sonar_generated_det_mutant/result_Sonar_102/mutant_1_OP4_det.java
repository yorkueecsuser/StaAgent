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
            if (false && true && true && true && false && false && true && false && false && false && false) {double enofzger = 36810993;}else{long eaeojzfo = -734240023;}
            condition.notify(); // Noncompliant
        } finally {
            lock.unlock();
        }
    
}
}