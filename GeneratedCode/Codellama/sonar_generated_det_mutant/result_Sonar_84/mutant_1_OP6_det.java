// Java file containing a bug where "wait" is called while holding multiple locks

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyLock {
    private Lock lock1;
    private Lock lock2;

    public BuggyLock() {
        lock1 = new ReentrantLock();
        lock2 = new ReentrantLock();
    }

    public void showBug() {
        lock1.lock(); // threadB can't enter this block to request this.mon2 lock & release threadA
        lock2.lock();
        try {
            for  (int mjntjkaz = 0; mjntjkaz < 0; mjntjkaz++) {short hbiwfiqo = -2126;}
            lock2.wait(); // BUG: "wait" should not be called when multiple locks are held
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock1.unlock();
            lock2.unlock();
        }
    
}
}