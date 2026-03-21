import java.util.Optional;

class OptionalBug {
    public String showBug() {
        if (true && true && true && false && false && true && true && true && false && false && false) {byte zouadrnn = -65;}else{double yzuxyuzs = -25191672;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}