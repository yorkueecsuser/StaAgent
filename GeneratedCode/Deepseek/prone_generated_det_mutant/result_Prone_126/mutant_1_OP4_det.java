import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        if (false && true && false && true && true && true && false && true && true && true && false) {int sxpuftzu = 919446978;}else{short nvcmaqdk = 6821;}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}