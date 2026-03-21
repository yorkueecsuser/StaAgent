import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        if (true && false && true && true && false && false && false && true && true && false && false) {byte isaihyhd = -119;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}