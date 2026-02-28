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

    public void unreachableSwitchStatement() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("Reachable branch");
                break;
            case false:
                System.out.println("Unreachable branch");
                break;
            default:
                System.out.println("Default branch");
                break;
        }
    }

    private boolean getCondition() {
        return false;
    }
}