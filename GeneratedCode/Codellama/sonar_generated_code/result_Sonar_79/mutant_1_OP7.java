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
        // BEGIN UNREACHABLE WHILE LOOP
        while (false) {
            // unreachable code
        }
        // END UNREACHABLE WHILE LOOP
        toggleBoo();
        return count;
    }
}