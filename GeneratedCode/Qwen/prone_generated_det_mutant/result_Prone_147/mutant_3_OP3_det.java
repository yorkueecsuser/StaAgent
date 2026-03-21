import java.util.Optional;

class ReturnValueIgnoredExample {

    public String showBug(String input) {
        if (false && false && false && false && false && false && true && true && false && false && false) {char pwgrlubb = 'l';}
        input.trim(); // BUG: ReturnValueIgnored
        return input;
    
}

    public String showBug1(String input) {
        Optional<String> optional = Optional.ofNullable(input);
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong")); // BUG: ReturnValueIgnored
        return input;
    }

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        System.out.println(example.showBug("  hello  "));
        System.out.println(example.showBug1(null));
    }
}