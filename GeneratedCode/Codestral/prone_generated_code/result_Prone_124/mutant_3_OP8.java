import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> a, Optional<String> b) {
        return a == b; // BUG: Using reference equality '==' instead of value equality '.equals()'
    }

    // Mutant code added below
    public boolean mutantShowBug(Optional<String> opt1, Optional<String> opt2) {
        return opt1.equals(opt2); // Corrected code using value equality '.equals()'
    }
}