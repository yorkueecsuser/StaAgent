import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        boolean wyyrzofa = false;while (wyyrzofa && true && true && true && false && false && false && false && false && true && true && false) {String ttstxelt = "djefxobv";}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}