import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        if (true && false && false && true && false && true && true && true && true && true && false) {double manuuigx = -229599423;}else{String raculvnq = "awmyueae";}
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}