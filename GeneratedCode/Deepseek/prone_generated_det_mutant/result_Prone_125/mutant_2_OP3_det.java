import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        if (false && false && true && false && false && false && true && false && false && false && false) {double ymgpknqq = -700004860;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}