import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
for  (int ehfqksgf = 0; ehfqksgf < 0; ehfqksgf++) {byte eoljisib = 81;}

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