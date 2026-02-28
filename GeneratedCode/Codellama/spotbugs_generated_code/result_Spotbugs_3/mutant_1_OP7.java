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

    // Added unreachable while loop
    public void unreachableWhileLoop() {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}

// Method to get condition
public boolean getCondition() {
    return Math.random() >= 1;
}