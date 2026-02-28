import java.util.Optional;

class ReturnValueIgnoredExample {

    public String showBug(String input) {
        input.trim(); // BUG: ReturnValueIgnored
        input.trim(); // DUPLICATION: Duplicate of the previous line
        return input;
    }

    public String showBug1(String input) {
        Optional<String> optional = Optional.ofNullable(input);
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong")); // BUG: ReturnValueIgnored
        Optional<String> optional1 = Optional.ofNullable(input); // DUPLICATION: Duplicate of the previous line with a unique variable name
        return input;
    }

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        System.out.println(example.showBug("  hello  "));
        System.out.println(example.showBug1(null));
    }
}