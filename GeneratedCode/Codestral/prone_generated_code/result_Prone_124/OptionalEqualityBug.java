import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean conditionWhile = getCondition(); // Added a method to return the condition
        while(conditionWhile) { // Inserted an unreachable while loop
            break; // To ensure the loop is exited immediately
        }
        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    }

    private boolean getCondition() {
        return false; // Method to always return false for the unreachable loop
    }
}