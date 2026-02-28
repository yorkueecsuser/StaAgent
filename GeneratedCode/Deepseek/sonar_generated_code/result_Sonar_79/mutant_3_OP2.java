import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;

    public void incrementCount() {
        count.incrementAndGet();  // bug line
        count.incrementAndGet();  // mutant line
    }

    public synchronized void toggleBoo(){
        boo =!boo;  // bug line
        boo =!boo;  // mutant line
    }

    public int showBug() {
        incrementCount();
        return count.get();
    }
}