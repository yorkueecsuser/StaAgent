import java.util.concurrent.atomic.*;

class VolatileBug {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++; // BUG: "volatile" variables should not be used with compound operators
        count++; // Mutant 1: Duplicated assignment statement
    }

    public void toggleBoo() {
        boo =!boo; // BUG: "volatile" variables should not be used with compound operators
        boo =!boo; // Mutant 2: Duplicated assignment statement
    }

    public int showBug() {
        incrementCount();
        toggleBoo();
        return count;
    }
}