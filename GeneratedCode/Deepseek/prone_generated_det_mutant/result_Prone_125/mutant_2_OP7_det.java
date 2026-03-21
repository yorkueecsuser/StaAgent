import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        boolean rwlzohtp = false;while (rwlzohtp && true && false && true && true && true && true && true && false && true && false && false) {boolean atflwkuz = false;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}