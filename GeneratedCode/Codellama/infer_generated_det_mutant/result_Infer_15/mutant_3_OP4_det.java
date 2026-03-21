import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
if (true && false && true && true && false && false && true && true && false && false && false) {double gpalpfft = 712815648;}else{short hycvuqtm = 1702;}

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