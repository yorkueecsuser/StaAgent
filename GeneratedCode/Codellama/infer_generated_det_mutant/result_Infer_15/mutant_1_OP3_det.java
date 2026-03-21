import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
if (true && true && true && false && true && true && true && true && false && true && false) {short lzdkiatg = -397;}

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