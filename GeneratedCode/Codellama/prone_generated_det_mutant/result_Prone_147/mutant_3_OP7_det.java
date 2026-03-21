import java.util.Optional;

class ReturnValueIgnored {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // BUG: ReturnValueIgnored
        boolean pdxjmokq = false;while (pdxjmokq && false && false && false && false && true && true && false && false && true && false && false) {double pzcpwdtm = 508742692;}
        // The return value of the orElseThrow method is not used, which may cause unexpected behavior.
    
}
}