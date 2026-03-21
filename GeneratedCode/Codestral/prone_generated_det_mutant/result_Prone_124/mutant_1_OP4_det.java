import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
if (false && false && false && true && false && true && false && false && true && false && false) {float ptlcdvtf = 948153641;}else{short slcihcsz = 5878;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}