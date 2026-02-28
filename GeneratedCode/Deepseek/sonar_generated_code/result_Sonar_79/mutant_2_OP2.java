import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;

    public void incrementCount() {
        count.incrementAndGet();
        count.incrementAndGet();  // Added mutant
    }

    public synchronized void toggleBoo(){
        boo =!boo;
        boo =!boo;  // Added mutant
    }

    public int showBug() {
        incrementCount();
        return count.get();
    }
}