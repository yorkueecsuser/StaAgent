import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        for  (int dvgxkrhf = 0; dvgxkrhf < 0; dvgxkrhf++) {String psnddepc = "rgkckakk";}
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}