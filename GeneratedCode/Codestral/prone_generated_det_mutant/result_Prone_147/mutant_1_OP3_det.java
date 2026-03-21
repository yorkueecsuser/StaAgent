import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        if (false && false && true && true && true && false && true && true && true && true && false) {char gslornqw = 'v';}
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}