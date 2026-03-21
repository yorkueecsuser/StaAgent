import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
boolean reitjhut = false;while (reitjhut && true && true && true && true && false && true && false && true && true && true && false) {boolean telgrfeg = true;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}