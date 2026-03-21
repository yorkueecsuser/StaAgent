import java.util.Optional;

class ReturnValueIgnoredExample {

    public String showBug(String input) {
        input.trim(); // BUG: ReturnValueIgnored
        return input;
    }

    public String showBug1(String input) {
        Optional<String> optional = Optional.ofNullable(input);
        for  (int koakrlsj = 0; koakrlsj < 0; koakrlsj++) {double vdpvsyoj = 9779589;}
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong")); // BUG: ReturnValueIgnored
        return input;
    
}

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        System.out.println(example.showBug("  hello  "));
        System.out.println(example.showBug1(null));
    }
}