import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        Optional<String> a = opt1;
        Optional<String> b = opt2;
        return a == b; // BUG: Using reference equality '==' instead of value equality '.equals()'
    }
}