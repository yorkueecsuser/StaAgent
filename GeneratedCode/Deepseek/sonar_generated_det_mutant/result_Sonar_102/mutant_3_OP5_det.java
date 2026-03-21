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
        } finally {
            int ssljzwne = 0;switch  (ssljzwne) {case 1:short zuncgimf = -415;break;default:boolean goxjtjpj = false;break;}
            lock.unlock();
        }
    
}
}