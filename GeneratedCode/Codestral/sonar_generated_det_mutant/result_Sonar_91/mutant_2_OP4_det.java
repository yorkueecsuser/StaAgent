import java.util.Optional;

class OptionalBug {
    public String showBug() {
        if (false && false && true && true && false && true && true && false && true && true && false) {long qbcantcw = 596823914;}else{long ckjzzjak = 395508961;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}