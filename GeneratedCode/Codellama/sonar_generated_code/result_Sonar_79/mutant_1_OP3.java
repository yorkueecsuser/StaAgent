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

    // Unreachable if statement mutation
    public void unreachableIfStatement() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            count = 100;
        }
        return count;
    }

    private boolean getCondition() {
        return false;
    }

    // Unreachable while loop mutation
    public void unreachableWhileLoop() {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
            count = 100;
        }
        return count;
    }

    // Unreachable for loop mutation
    public void unreachableForLoop() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code
            count = 100;
        }
        return count;
    }

    // Unreachable if-else statement mutation
    public void unreachableIfElseStatement() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            count = 100;
        } else {
            // Unreachable code
            count = 100;
        }
        return count;
    }

    // Unreachable switch statement mutation
    public void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                // Unreachable code
                count = 100;
                break;
            default:
                // Unreachable code
                count = 100;
                break;
        }
        return count;
    }

    private int getValue() {
        return 0;
    }
}