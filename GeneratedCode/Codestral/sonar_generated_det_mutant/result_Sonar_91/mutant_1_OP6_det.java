import java.util.Optional;

class OptionalBug {
    public String showBug() {
        for  (int fkiraukt = 0; fkiraukt < 0; fkiraukt++) {char bgflorzn = 'f';}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}