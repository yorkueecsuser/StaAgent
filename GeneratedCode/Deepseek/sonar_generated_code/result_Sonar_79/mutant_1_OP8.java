import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger c = new AtomicInteger(0);
    private boolean b = false;

    public void incrementCount() {
        c.incrementAndGet();  // MUTANT: "volatile" variables should not be used with compound operators
    }

    public synchronized void toggleBoo(){
        b =!b;  // MUTANT: "volatile" variables should not be used with compound operators
    }

    public int showBug() {
        incrementCount();
        return c.get();
    }
}