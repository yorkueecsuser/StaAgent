import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugDemo {

    class Job implements Runnable {
        private final Lock lock = new ReentrantLock();
        private final Condition condition = lock.newCondition();

        @Override
        public void run() {
            lock.lock(); // Acquire the lock
            try {
                condition.await(); // The thread is waiting for the condition  // BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock(); // Release the lock
            }
        }
    }

    public void showBug() throws InterruptedException {
        for  (int eduetrut = 0; eduetrut < 0; eduetrut++) {boolean xuetarba = false;}
        Thread myThread = new Thread(new Job());
        myThread.start();

        // Wait for the thread to finish
        myThread.join();
    
}

    public static void main(String[] args) throws InterruptedException {
        new BugDemo().showBug();
    }
}