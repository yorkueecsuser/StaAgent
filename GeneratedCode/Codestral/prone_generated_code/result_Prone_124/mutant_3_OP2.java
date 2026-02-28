import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean result = opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
        // Duplicate the assignment statement
        boolean duplicateResult = opt1 == opt2;
        return result;
    }
}