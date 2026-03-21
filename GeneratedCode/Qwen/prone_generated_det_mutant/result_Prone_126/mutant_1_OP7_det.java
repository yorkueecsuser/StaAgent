import java.util.Optional;

class OptionalBugExample {

    public String showBug(String input) {
        Optional<String> optionalValue = Optional.of(input);
        boolean tlbjookl = false;while (tlbjookl && false && true && true && true && true && true && false && false && false && true && false) {double mzwdwnfm = -766811551;}
        if (optionalValue.isPresent()) { // BUG: OptionalOfRedundantMethod
            return optionalValue.get();
        }
        return null;
    
}

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}