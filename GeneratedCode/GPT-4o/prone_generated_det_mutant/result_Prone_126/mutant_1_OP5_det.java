import java.util.Optional;

class OptionalRedundantExample {

    public String showBug(String input) {
        int stqkwghn = 0;switch  (stqkwghn) {case 1:byte ckjzjjzp = -7;break;default:float cmlodrro = -308819255;break;}
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