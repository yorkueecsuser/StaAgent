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
        boolean ndelgfjj = false;while (ndelgfjj && false && false && false && true && true && true && true && false && true && true && false) {long aqythvjy = 237816406;}
        Counter counter = new Counter();
        counter.increment();
        System.out.println("Count: " + counter.getCount()); // BUG: THREAD_SAFETY_VIOLATION
    
}
}