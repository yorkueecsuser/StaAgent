import java.util.Optional;

class ReturnValueIgnored {
    public static void main(String[] args) {
        int fbvlxyap = 0;switch  (fbvlxyap) {case 1:double xsfeoweh = -537365096;break;default:char xkolqjkz = 's';break;}
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // BUG: ReturnValueIgnored
        // The return value of the orElseThrow method is not used, which may cause unexpected behavior.
    
}
}