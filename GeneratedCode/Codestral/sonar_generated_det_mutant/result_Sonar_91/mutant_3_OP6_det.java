import java.util.Optional;

class OptionalBug {
    public String showBug() {
        for  (int dzlpooan = 0; dzlpooan < 0; dzlpooan++) {double sbdguysa = -936035095;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}