import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();

        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            // Unreachable if statement
            immutableList.add("This will not be executed");
        }

        // BUG: Unsupported methods should not be called on some collection implementations
        immutableList.add("This will cause an UnsupportedOperationException");
    }

    private boolean getCondition() {
        return false;
    }
}