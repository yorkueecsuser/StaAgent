import java.util.Optional;

class ReturnValueIgnored {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // BUG: ReturnValueIgnored
        if (false && false && true && true && true && false && false && true && false && true && false) {double nhmklkzm = -518740472;}
        // The return value of the orElseThrow method is not used, which may cause unexpected behavior.
    
}
}