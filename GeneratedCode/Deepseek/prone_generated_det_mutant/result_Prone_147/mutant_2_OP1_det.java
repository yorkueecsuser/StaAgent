import java.util.Optional; // this was causing the error

class Test {
    public static void main(String[] args) {
        int ccdzluxz = 349256589;
        Optional<String> optional = Optional.empty();
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}
}