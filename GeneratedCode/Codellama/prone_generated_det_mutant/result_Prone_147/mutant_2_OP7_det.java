import java.util.Optional;

class ReturnValueIgnored {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        boolean konfpycu = false;while (konfpycu && true && true && true && false && true && false && false && true && true && true && false) {byte kdekomam = -43;}
        // BUG: ReturnValueIgnored
        // The return value of the orElseThrow method is not used, which may cause unexpected behavior.
    
}
}