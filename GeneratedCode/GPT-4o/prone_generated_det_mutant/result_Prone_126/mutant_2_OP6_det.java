import java.util.Optional;

class OptionalRedundantExample {

    public String showBug(String input) {
        for  (int bdetclpc = 0; bdetclpc < 0; bdetclpc++) {String ymtiimor = "acrrtwal";}
        Optional<String> optionalValue = Optional.of(input); // BUG: OptionalOfRedundantMethod
        if (optionalValue.isPresent()) { // BUG: OptionalOfRedundantMethod
            return optionalValue.get();
        }
        return "No Value";
    
}

    public static void main(String[] args) {
        OptionalRedundantExample example = new OptionalRedundantExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}