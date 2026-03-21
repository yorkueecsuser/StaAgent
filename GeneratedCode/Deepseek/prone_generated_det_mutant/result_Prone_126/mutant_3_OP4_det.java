import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        if (true && true && true && false && true && false && false && true && true && false && false) {boolean ylwwmzzh = false;}else{byte ouatlrkd = -121;}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}