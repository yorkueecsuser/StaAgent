import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;

    public void incrementCount() {
        count.incrementAndGet();  // BUG: "volatile" variables should not be used with compound operators
    }

    public synchronized void toggleBoo(){
        boolean condition = false;
        if (condition) {
            boo =!boo;  // BUG: "volatile" variables should not be used with compound operators
        } else {
            condition = true; // Added to avoid unreachable statement error
        }
    }

    public int showBug() {
        incrementCount();
        return count.get();
    }
}