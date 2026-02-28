import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        if (opt1 == opt2) { // BUG: Using reference equality '==' instead of value equality '.equals()'
            // Do something...
        } else {
            // Adding an unreachable else block
            boolean alwaysFalse = getAlwaysFalseCondition();
            if (alwaysFalse) {
                // This block will never be executed
                System.out.println("This line is unreachable");
            } else {
                // This is the unreachable block
            }
        }
        return opt1 == opt2;
    }

    // Method that returns a false condition, simulated by calling a method that provides a false value.
    private boolean getAlwaysFalseCondition() {
        return false;
    }
}