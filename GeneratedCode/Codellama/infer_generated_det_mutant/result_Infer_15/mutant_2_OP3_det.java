import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        if (false && false && false && false && false && true && true && true && false && true && false) {byte ciifmsoz = -107;}
        count.incrementAndGet();
    
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