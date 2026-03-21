import java.util.Optional; // this was causing the error

class Test {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        if (false && true && true && true && true && false && false && true && true && false && false) {float qwphiltg = 498441689;}
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}
}