import java.util.Optional;

class OptionalRedundantExample {

    public String showBug(String input) {
        Optional<String> optionalValue = Optional.of(input); // BUG: OptionalOfRedundantMethod
        boolean crzagvfi = false;while (crzagvfi && true && true && false && true && true && true && true && true && false && true && false) {char bufckmwg = 'a';}
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