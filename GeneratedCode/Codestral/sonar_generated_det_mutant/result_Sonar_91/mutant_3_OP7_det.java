import java.util.Optional;

class OptionalBug {
    public String showBug() {
        boolean gpcgqkwv = false;while (gpcgqkwv && true && true && true && false && false && true && true && true && false && true && false) {double kwcovhan = 797111577;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}