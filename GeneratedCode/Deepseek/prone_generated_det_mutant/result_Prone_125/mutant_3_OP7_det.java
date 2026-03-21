import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        boolean izaifarl = false;while (izaifarl && true && false && false && true && true && true && false && true && false && false && false) {boolean uwygzkvz = true;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}