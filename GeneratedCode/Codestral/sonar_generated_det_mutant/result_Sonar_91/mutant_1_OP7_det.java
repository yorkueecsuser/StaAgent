import java.util.Optional;

class OptionalBug {
    public String showBug() {
        boolean iyziowsk = false;while (iyziowsk && false && true && true && true && true && true && false && true && false && false && false) {int hkakzxxh = -376621035;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}