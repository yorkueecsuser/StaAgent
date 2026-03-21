import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
if (true && true && false && false && false && true && false && true && false && true && false) {double nbthdamo = 960251688;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}