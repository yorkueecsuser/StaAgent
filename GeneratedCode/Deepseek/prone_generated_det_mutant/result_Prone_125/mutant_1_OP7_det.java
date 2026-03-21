import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        boolean ktlelevr = false;while (ktlelevr && true && true && true && true && true && true && true && true && false && true && false) {float tgoraspz = -414827794;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}