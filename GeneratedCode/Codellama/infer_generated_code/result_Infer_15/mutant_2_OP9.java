import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        do {
            counter.increment();
        } while (counter.getCount() < 10);
        System.out.println("Count: " + counter.getCount()); // BUG: THREAD_SAFETY_VIOLATION
    }
}