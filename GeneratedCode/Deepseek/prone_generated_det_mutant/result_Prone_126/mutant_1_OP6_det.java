import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        for  (int imsgoiaq = 0; imsgoiaq < 0; imsgoiaq++) {float gsmyxaar = -903361432;}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}