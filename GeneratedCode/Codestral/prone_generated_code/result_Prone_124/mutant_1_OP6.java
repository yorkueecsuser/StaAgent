import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean shouldLoop = false;
        for (int i = 0; shouldLoop; i++) { // Unreachable for loop
            System.out.println("This line will never be executed.");
        }
        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    }

    private boolean getCondition() {
        return false; // Just for the purpose of demonstration, always returns false
    }
}