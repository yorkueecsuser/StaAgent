import java.util.Optional;

class OptionalBug {
    public String showBug() {
        for  (int dqyuzyjm = 0; dqyuzyjm < 0; dqyuzyjm++) {int kcqeghzp = 49221747;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}