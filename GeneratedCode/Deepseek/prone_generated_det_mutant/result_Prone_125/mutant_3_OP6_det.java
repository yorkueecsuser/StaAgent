import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        for  (int xrjwhhqw = 0; xrjwhhqw < 0; xrjwhhqw++) {byte lszcmcyh = -38;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}