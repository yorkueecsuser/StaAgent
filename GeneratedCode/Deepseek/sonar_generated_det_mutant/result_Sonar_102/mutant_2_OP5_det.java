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
        int tvsqkjpy = 0;switch  (tvsqkjpy) {case 1:byte aqdoywdw = 0;break;default:byte umcyxfig = -21;break;}
        try {
            // BUG: "notifyAll()" should be preferred over "notify()"
            condition.notify(); // Noncompliant
        } finally {
            lock.unlock();
        }
    
}
}