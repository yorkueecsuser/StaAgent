import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        if (false && true && true && true && true && false && false && true && false && false && false) {float jxycqsbs = -984946686;}else{long avdqgeyh = 451689703;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}