import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute.");
        }
        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    }

    private boolean getCondition() {
        // For demonstration purposes, this method always returns false
        return false;
    }
}