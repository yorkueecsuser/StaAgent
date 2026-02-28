import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    }
}