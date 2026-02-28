import java.util.Optional;

class OptionalBugExample {

    public String showBug(String input) {
        Optional<String> optionalValue = Optional.of(input);
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