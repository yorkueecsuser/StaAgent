import java.util.Optional;

class OptionalBug {
    public String showBug() {
        char cuurzqbm = 't';
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}