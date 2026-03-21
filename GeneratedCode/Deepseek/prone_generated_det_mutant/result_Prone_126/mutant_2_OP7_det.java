import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        boolean ghylqwip = false;while (ghylqwip && true && false && true && false && false && true && false && false && false && true && false) {long ayscaigc = -630034873;}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}