import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // Original code
        String str2 = null; // Mutant code: Duplicated assignment statement
        Optional<String> optionalStr2 = Optional.of(str2); // Mutant code: Duplicated assignment statement
        return optionalStr;
    }
}