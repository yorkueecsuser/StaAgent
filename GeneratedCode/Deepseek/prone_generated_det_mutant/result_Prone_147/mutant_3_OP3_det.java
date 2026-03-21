import java.util.Optional; // this was causing the error

class Test {
    public static void main(String[] args) {
        if (false && true && true && false && true && true && false && false && true && false && false) {boolean ypfoclrl = false;}
        Optional<String> optional = Optional.empty();
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}
}