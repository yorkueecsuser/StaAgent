import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        byte mksczlqc = 46;
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}