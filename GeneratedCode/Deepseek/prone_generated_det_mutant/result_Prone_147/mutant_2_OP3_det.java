import java.util.Optional; // this was causing the error

class Test {
    public static void main(String[] args) {
        if (false && false && true && false && true && false && false && false && true && false && false) {float zbayozdk = 267042420;}
        Optional<String> optional = Optional.empty();
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}
}