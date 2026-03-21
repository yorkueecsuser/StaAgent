import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        for  (int hbjvinab = 0; hbjvinab < 0; hbjvinab++) {String xzncueuq = "tjbmocdb";}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}