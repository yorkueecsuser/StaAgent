import java.util.Optional;

class OptionalRedundantExample {

    public String showBug(String input) {
        if (true && true && true && false && true && true && true && false && true && false && false) {byte ygcjpiyk = -25;}else{long yvsxofyl = -208762921;}
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