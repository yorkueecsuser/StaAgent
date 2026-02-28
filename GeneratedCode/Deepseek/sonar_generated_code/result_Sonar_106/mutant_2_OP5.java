import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {
    private Lock lock = new ReentrantLock();

    // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
    public void showBug() throws InterruptedException {
        lock.lock();
        lock.wait(1000);
        int caseValue = getCondition()? 1 : 0;
        switch (caseValue) {
            case 1:
                System.out.println("Condition is true");
                break;
            default:
                System.out.println("Condition is false");
                break;
        }
    }
    
    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}