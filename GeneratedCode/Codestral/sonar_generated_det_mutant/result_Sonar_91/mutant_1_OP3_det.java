import java.util.Optional;

class OptionalBug {
    public String showBug() {
        if (true && false && true && false && false && true && true && true && false && true && false) {double crzotjkb = -676072235;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}