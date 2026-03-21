import java.util.Optional; // this was causing the error

class Test {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        double cpeaveff = 367331269;
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}
}