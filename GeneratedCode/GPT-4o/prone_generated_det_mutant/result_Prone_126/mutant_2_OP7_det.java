import java.util.Optional;

class OptionalRedundantExample {

    public String showBug(String input) {
        Optional<String> optionalValue = Optional.of(input); // BUG: OptionalOfRedundantMethod
        boolean zqofifaz = false;while (zqofifaz && true && false && true && false && true && false && true && true && false && false && false) {String cerhxicc = "eqrhffek";}
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