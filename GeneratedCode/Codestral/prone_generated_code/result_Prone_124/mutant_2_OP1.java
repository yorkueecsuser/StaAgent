import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        String deadStore = "deadstore"; // Dead Store: Added an unused variable declaration
        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    }
}