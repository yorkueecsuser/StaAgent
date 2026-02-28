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

// Renaming Mutation Operator
class VolatileBug {
    private volatile int c = 0;
    private volatile boolean b = false;

    public void incrementCount() {
        c++; // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo() {
        b =!b; // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug() {
        incrementCount();
        toggleBoo();
        return c;
    }
}