import java.util.Optional;

class OptionalEqualityBug {
    private boolean getUnreachableCondition() {
        return false; // Always false, making the condition unreachable
    }

    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            // Unreachable code block
            throw new RuntimeException("This code should never be reached!");
        } else {
            return opt1 == opt2; // Original code
        }
    }
}