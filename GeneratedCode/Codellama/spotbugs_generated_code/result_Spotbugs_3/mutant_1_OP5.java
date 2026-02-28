import java.util.ArrayList;
import java.util.List;

class NonNullFieldNotInitialized {
    private final List<String> list; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldNotInitialized(List<String> list) {
        // Bug is not fixed as it is required to demonstrate the bug
        this.list = null;
    }

    public List<String> showBug() {
        return list;
    }

    // Unreachable switch statement mutant code
    public void unreachableSwitchStatement() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // unreachable code
                break;
            case false:
                // reachable code
                break;
            default:
                // unreachable code
                break;
        }
    }

    private boolean getCondition() {
        // method to provide a dynamic condition for switch statement
        return System.currentTimeMillis() % 2 == 0;
    }
}