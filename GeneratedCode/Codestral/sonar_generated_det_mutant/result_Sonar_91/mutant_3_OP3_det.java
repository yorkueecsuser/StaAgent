import java.util.Optional;

class OptionalBug {
    public String showBug() {
        if (false && false && true && true && true && false && false && true && false && false && false) {boolean amtiupxz = false;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}