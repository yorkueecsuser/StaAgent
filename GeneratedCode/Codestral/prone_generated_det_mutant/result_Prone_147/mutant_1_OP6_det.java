import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        for  (int glgmpeuh = 0; glgmpeuh < 0; glgmpeuh++) {boolean ogtbxnes = false;}
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    
}

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}