import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafetyExample {
    private AtomicInteger counter = new AtomicInteger(0);

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int showBug() {
        // BUG: THREAD_SAFETY_VIOLATION
        // This code is thread-unsafe because the 'counter++' operation is not atomic
        // and can potentially lead to race conditions.
        Thread myThread1 = new Thread(this::incrementCounter);
        Thread myThread2 = new Thread(this::incrementCounter);
        myThread1.start();
        myThread2.start();
        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return counter.get();
    }

    public static void main(String[] args) {
        ThreadSafetyExample example = new ThreadSafetyExample();
        System.out.println(example.showBug());
    }
}