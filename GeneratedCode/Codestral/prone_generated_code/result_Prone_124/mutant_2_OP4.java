import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        if (getUnreachableCondition()) {
            // Unreachable branch
            return true;
        } else {
            // Original code
            return opt1 == opt2;
        }
    }

    // Method that always returns false to ensure the branch is unreachable
    private boolean getUnreachableCondition() {
        return false;
    }
}