import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        if (true && false && true && false && true && true && false && true && true && false && false) {byte mutjmvgz = 99;}else{String sluldvhn = "ddogfujj";}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}