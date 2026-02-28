import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        do {
            count.incrementAndGet();
        } while (count.get() < 100);
    }

    public int getCount() {
        return count.get();
    }
}

class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        System.out.println("Count: " + counter.getCount()); // BUG: THREAD_SAFETY_VIOLATION
    }
}