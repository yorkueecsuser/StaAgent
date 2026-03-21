import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
boolean gakfxcqp = false;while (gakfxcqp && true && false && true && true && true && false && false && true && true && false && false) {String jgmfpeei = "zknekxaj";}

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    
}
}