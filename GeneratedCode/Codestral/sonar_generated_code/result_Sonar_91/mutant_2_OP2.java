import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // Original code

        // Mutant code added: Duplicating the assignment statement
        Optional<String> optionalStrDuplicate = Optional.of(str);

        return optionalStr;
    }
}