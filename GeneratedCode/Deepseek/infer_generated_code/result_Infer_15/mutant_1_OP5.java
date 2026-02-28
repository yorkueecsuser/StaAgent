import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafetyExample {
    private AtomicInteger counter = new AtomicInteger(0);

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int showBug() {
        // Mutation: Unreachable switch statement
        // This switch statement is unreachable because the condition (false) always evaluates to false
        switch (false) {
            default:
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
                break;
        }
        return counter.get();
    }

    public static void main(String[] args) {
        ThreadSafetyExample example = new ThreadSafetyExample();
        System.out.println(example.showBug());
    }
}