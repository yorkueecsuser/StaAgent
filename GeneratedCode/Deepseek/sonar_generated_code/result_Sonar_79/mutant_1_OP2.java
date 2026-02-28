import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private volatile AtomicInteger count = new AtomicInteger(0);
    private volatile boolean boo = false;

    public void incrementCount() {
        count.incrementAndGet();  // BUG: "volatile" variables should not be used with compound operators
    }

    public synchronized void toggleBoo(){
        boo =!boo;  // BUG: "volatile" variables should not be used with compound operators
    }

    public synchronized void incrementCountDuplicate() {
        count.incrementAndGet();  // DUPLICATED BUG: "volatile" variables should not be used with compound operators
    }

    public synchronized void toggleBooDuplicate() {
        boo =!boo;  // DUPLICATED BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug() {
        incrementCount();
        incrementCountDuplicate();
        return count.get();
    }

    public boolean showBugBoolean() {
        toggleBoo();
        toggleBooDuplicate();
        return boo;
    }
}