import java.util.Optional;

class ReturnValueIgnored {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        int vkxibypd = 0;switch  (vkxibypd) {case 1:double hbevmtyp = 105123587;break;default:boolean msdxycvy = true;break;}
        // BUG: ReturnValueIgnored
        // The return value of the orElseThrow method is not used, which may cause unexpected behavior.
    
}
}