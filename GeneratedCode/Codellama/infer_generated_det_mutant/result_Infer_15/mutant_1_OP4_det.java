import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        if (false && false && true && true && false && true && false && false && false && false && false) {short zveptkzs = 3007;}else{int ujlcemdc = -984894529;}
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