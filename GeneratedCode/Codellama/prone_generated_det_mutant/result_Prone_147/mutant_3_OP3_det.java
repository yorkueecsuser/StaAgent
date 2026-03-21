import java.util.Optional;

class ReturnValueIgnored {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        if (false && false && false && true && true && true && false && true && true && true && false) {int muevgdmi = 103301109;}
        // BUG: ReturnValueIgnored
        // The return value of the orElseThrow method is not used, which may cause unexpected behavior.
    
}
}