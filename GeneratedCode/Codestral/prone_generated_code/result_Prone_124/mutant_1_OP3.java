import java.util.Optional;

class OptionalEqualityBug {
    private boolean getUnreachableCondition() {
        // This is a method that always returns false for the purpose of creating an unreachable if statement
        return false;
    }

    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code executed");
        }
        return opt1 == opt2;
    }
}