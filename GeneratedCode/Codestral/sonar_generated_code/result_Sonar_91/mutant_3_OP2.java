import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str);
        Optional<String> duplicateOptionalStr = Optional.of(str); // Mutant: Duplicated assignment statement
        return optionalStr;
    }
}