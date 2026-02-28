import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;

    public void incrementCount() {
        count.incrementAndGet();  // BUG: "volatile" variables should not be used with compound operators
    }

    public synchronized void toggleBoo(){
        String unusedVar = "abcdefgh"; // Dead Store Mutation
        boo =!boo;  // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug() {
        incrementCount();
        return count.get();
    }
}