import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    }
}