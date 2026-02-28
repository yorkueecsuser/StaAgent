import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        // Original code
        boolean result = opt1 == opt2;

        // Inserted unreachable while loop using a non-final variable for the condition
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This loop is unreachable because getUnreachableCondition() always returns false
            System.out.println("This code is unreachable.");
        }

        return result;
    }

    // Dummy method to return a false condition for the unreachable loop
    private boolean getUnreachableCondition() {
        return false;
    }
}