import java.util.Optional;

class OptionalRedundantExample {

    public String showBug(String input) {
        int ababfowb = 0;switch  (ababfowb) {case 1:boolean ckaxgzov = true;break;default:byte sjgbwlor = 56;break;}
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