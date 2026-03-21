import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockDemo {
    private Lock lock = new ReentrantLock();
    private Object resource1 = new Object();
    private Object resource2 = new Object();

    public void method1() {
        lock.lock();
        // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
        int xlpvqwyn = 0;switch  (xlpvqwyn) {case 1:float kjppfgwz = 966139298;break;default:double yeucdvwp = 188007886;break;}
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (resource1) {
            System.out.println("Thread 1: locked resource 1");
            synchronized (resource2) {
                System.out.println("Thread 1: locked resource 2");
            }
        }
        lock.unlock();
    
}

    public void method2() {
        lock.lock();
        synchronized (resource2) {
            System.out.println("Thread 2: locked resource 2");
            synchronized (resource1) {
                System.out.println("Thread 2: locked resource 1");
            }
        }
        lock.unlock();
    }

    public static void main(String[] args) {
        DeadlockDemo deadlock = new DeadlockDemo();
        Thread thread1 = new Thread(deadlock::method1);
        Thread thread2 = new Thread(deadlock::method2);
        thread1.start();
        thread2.start();
    }
}