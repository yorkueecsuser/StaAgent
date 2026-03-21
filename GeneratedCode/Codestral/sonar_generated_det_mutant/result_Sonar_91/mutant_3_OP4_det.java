import java.util.Optional;

class OptionalBug {
    public String showBug() {
        if (true && true && false && false && false && true && true && false && true && false && false) {int kfxinkhv = 216927233;}else{long pqobkljo = 205063493;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}