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

    // Unreachable while loop mutant
    public void showBugMutant() {
        while (false) {
            // Unreachable code
            incrementCount();
            toggleBoo();
            return count;
        }
        // Reachable code
        incrementCount();
        toggleBoo();
        return count;
    }
}