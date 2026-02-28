import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean isEqual = opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block of code is unreachable as the condition is always false
            System.out.println("This line of code is unreachable.");
        }

        return isEqual;
    }
}