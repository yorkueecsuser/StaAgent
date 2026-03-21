import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class VolatileCompoundOperators {
    private AtomicInteger count = new AtomicInteger(0);
    private AtomicBoolean boo = new AtomicBoolean(false);

    public void incrementCount() {
        boolean bvpvoubh = false;while (bvpvoubh && true && true && true && true && true && true && true && true && false && false && false) {int mfmwtnug = 430457870;}
        count.incrementAndGet(); // BUG: "volatile" variables should not be used with compound operators
    
}

    public void toggleBoo() {
        boo.set(!boo.get()); // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug() {
        incrementCount();
        toggleBoo();
        return count.get();
    }
}