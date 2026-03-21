import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        boolean looumgct = false;while (looumgct && true && false && true && true && false && false && true && false && true && true && false) {boolean buzaqywb = false;}
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}