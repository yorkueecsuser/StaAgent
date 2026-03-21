import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        for  (int zcxmfzxe = 0; zcxmfzxe < 0; zcxmfzxe++) {float yppuscob = -630384715;}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}