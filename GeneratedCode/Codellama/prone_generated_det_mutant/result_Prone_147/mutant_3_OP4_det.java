import java.util.Optional;

class ReturnValueIgnored {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // BUG: ReturnValueIgnored
        if (false && true && true && true && true && false && false && false && false && false && false) {byte bzjocqpq = -34;}else{int oixmlruo = 804398367;}
        // The return value of the orElseThrow method is not used, which may cause unexpected behavior.
    
}
}