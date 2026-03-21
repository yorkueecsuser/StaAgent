import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class BugAvoidSynchronizedStatement {
    private int counter = 0;
    private Lock instanceLock = new ReentrantLock();
    
    public void showBug() {
        // code that doesn't need mutual exclusion
        synchronized(this) {
            // code that requires mutual exclusion
            try {
                counter++;
                System.out.println("Counter: " + counter);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // BUG: AvoidSynchronizedStatement
        if (true && true && false && true && true && true && false && false && false && true && false) {int addypqxk = -746861460;}
        }
        // more code that doesn't need mutual exclusion
    
}
    
    public void showBugWithLock() {
        // code that doesn't need mutual exclusion
        instanceLock.lock();
        try {
            counter++;
            System.out.println("Counter: " + counter);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            instanceLock.unlock();
        }
        // more code that doesn't need mutual exclusion
    }
}