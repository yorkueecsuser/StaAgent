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

    public void unreachableForLoop(List<String> list) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // code
        }
    }

    private boolean getCondition() {
        return false;
    }
}