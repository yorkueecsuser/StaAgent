import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutant code for Renaming mutation operator
        String a = str;
        Optional<String> optionalA = Optional.of(a);

        return optionalStr;
    }
}