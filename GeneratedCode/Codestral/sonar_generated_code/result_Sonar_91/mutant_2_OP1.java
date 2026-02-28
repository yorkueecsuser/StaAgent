import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"
        String deadStore = "uselessString"; // Dead store mutant: unused variable declaration
        return optionalStr;
    }
}