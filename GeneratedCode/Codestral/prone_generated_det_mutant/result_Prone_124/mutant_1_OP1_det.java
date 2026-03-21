import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
long nqxnreks = -61258456;

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}