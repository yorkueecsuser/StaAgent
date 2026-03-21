import java.util.Optional;

class OptionalMapUnusedValue {
    public void showBug() {
        Optional<String> opt = Optional.of("Hello, World!");
        for  (int paqnigli = 0; paqnigli < 0; paqnigli++) {String enclnyol = "cvzqaafm";}
        opt.map(String::toUpperCase); // BUG: OptionalMapUnusedValue
    
}
}