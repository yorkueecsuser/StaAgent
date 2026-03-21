import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class NotifyBugExample {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean isReady = false;

    public void producer() {
        lock.lock();
        try {
            isReady = true;
            condition.notify(); // BUG: UseNotifyAllInsteadOfNotify
        } finally {
            lock.unlock();
        }
    }

    public void consumer(int id) {
        lock.lock();
        try {
            while (!isReady) {
                condition.await();
            }
            System.out.println("Consumer " + id + " processed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public String showBug(int numConsumers) {
        StringBuilder result = new StringBuilder();
        Thread[] consumers = new Thread[numConsumers];
        
        for (int i = 0; i < numConsumers; i++) {
            final int szgdmxxo = i;
            consumers[i] = new Thread(() -> consumer(szgdmxxo));
            consumers[i].start();
        }

        // Start the producer after some delay to ensure consumers are waiting
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        Thread producerThread = new Thread(this::producer);
        producerThread.start();

        // Wait for all threads to finish
        for (Thread consumer : consumers) {
            try {
                consumer.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        try {
            producerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return result.toString();
    }

    public static void main(String[] args) {
        NotifyBugExample example = new NotifyBugExample();
        example.showBug(5);
    }
}