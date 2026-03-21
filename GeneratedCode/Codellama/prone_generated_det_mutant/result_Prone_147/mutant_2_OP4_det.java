import java.util.Optional;

class ReturnValueIgnored {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // BUG: ReturnValueIgnored
        if (false && false && false && false && false && false && false && false && true && false && false) {int bwerybyb = 709334114;}else{String iipxegrh = "hzpfezdl";}
        // The return value of the orElseThrow method is not used, which may cause unexpected behavior.
    
}
}