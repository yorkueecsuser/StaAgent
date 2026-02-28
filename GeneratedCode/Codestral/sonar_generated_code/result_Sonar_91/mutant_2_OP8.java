import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutated code
        String x = str;
        Optional<String> optionalX = Optional.of(x);

        return optionalStr;
    }
}