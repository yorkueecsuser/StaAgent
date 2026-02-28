import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafetyExample {
    private AtomicInteger counter = new AtomicInteger(0);
    private boolean shouldRun = false;

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int showBug() {
        // BUG: THREAD_SAFETY_VIOLATION
        // This code is thread-unsafe because the 'counter++' operation is not atomic
        // and can potentially lead to race conditions.
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
        if (shouldRun) { // Mutation: Replace the condition with a non-final variable
            return counter.get();
        } else {
            System.out.println("Unreachable Code");
            return -1;
        }
    }

    public static void main(String[] args) {
        ThreadSafetyExample example = new ThreadSafetyExample();
        System.out.println(example.showBug());
    }
}