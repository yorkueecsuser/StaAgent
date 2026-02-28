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

    // Unreachable switch statement mutant
    public void switchStatementMutant() {
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            case 2:
                // code
                break;
            default:
                // unreachable code
        }
    }
}