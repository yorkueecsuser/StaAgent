import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        if (true && true && true && false && true && true && false && false && false && true && false) {int npkhkmlm = 748027420;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}