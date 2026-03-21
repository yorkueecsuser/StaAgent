import java.util.Optional;

class OptionalBug {
    public String showBug() {
        boolean dnmgbiiw = false;while (dnmgbiiw && true && true && true && true && true && true && false && true && false && false && false) {short hyloenrt = -5448;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}