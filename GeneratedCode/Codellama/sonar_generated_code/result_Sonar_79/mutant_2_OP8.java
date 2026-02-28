import java.util.concurrent.atomic.*;

class VolatileBug {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++; // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo() {
        boo =!boo; // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug() {
        incrementCount();
        toggleBoo();
        return count;
    }
}

// Mutated code
class VolatileBugMutant {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count = count + 1;
    }

    public void toggleBoo() {
        boo =!boo;
    }

    public int showBug() {
        incrementCount();
        toggleBoo();
        return count;
    }
}