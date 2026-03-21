import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
boolean jslhbbta = false;while (jslhbbta && true && false && false && true && true && true && false && true && false && false && false) {float xszbqhkw = 621257836;}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}