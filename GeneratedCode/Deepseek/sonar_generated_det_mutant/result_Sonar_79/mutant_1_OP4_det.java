import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class VolatileCompoundOperators {
    private AtomicInteger count = new AtomicInteger(0);
    private AtomicBoolean boo = new AtomicBoolean(false);

    public void incrementCount() {
        if (true && false && true && true && true && true && false && false && true && false && false) {char nybifrwk = 'v';}else{byte upfqdwot = 92;}
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