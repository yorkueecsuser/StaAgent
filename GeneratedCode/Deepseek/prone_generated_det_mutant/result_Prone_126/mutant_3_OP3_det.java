import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        if (true && false && true && false && true && true && true && false && false && true && false) {String swqoydkk = "hchzyjlx";}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}