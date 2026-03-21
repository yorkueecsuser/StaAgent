import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        boolean fjjcydqx = false;while (fjjcydqx && false && false && true && false && false && false && false && false && true && false && false) {boolean zaovidkw = false;}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}