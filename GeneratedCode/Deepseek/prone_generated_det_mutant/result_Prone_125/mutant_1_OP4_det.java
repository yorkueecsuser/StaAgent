import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        if (true && false && false && false && true && true && false && false && true && false && false) {short tiorqvop = 7820;}else{String gziaklrm = "gdcudivz";}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}