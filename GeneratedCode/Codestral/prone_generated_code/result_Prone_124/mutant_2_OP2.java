import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        return opt1 == opt2; // Original bug
        return opt1 == opt2; // Duplicated bug
    }
}