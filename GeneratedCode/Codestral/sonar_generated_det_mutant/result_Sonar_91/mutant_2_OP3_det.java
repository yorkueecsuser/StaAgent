import java.util.Optional;

class OptionalBug {
    public String showBug() {
        if (false && false && false && true && false && true && true && true && false && true && false) {boolean uxvedxrp = false;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}