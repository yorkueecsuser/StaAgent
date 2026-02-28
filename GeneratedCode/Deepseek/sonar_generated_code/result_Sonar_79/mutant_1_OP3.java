import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;

    public void incrementCount() {
        count.incrementAndGet();  // BUG: "volatile" variables should not be used with compound operators
        if(false) {
            count.incrementAndGet();
        }
    }

    public synchronized void toggleBoo(){
        boo =!boo;  // BUG: "volatile" variables should not be used with compound operators
        if(false) {
            boo =!boo;
        }
    }

    public int showBug() {
        incrementCount();
        if(false) {
            incrementCount();
        }
        return count.get();
    }
}