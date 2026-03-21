import java.util.Optional;

class ReturnValueIgnoredExample {

    public String showBug(String input) {
        input.trim(); // BUG: ReturnValueIgnored
        return input;
    }

    public String showBug1(String input) {
        Optional<String> optional = Optional.ofNullable(input);
        for  (int irmlvist = 0; irmlvist < 0; irmlvist++) {double aghpqzug = -3291831;}
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong")); // BUG: ReturnValueIgnored
        return input;
    
}

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        System.out.println(example.showBug("  hello  "));
        System.out.println(example.showBug1(null));
    }
}