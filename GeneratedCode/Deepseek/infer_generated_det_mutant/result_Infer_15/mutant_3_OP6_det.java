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
        for  (int fahzibqr = 0; fahzibqr < 0; fahzibqr++) {short zonltnmp = 7613;}
        Thread thread1 = new Thread(this::incrementCounter);
        Thread thread2 = new Thread(this::incrementCounter);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
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