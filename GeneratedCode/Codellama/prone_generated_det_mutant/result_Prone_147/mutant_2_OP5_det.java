import java.util.Optional;

class ReturnValueIgnored {
    public static void main(String[] args) {
        int zzogkxul = 0;switch  (zzogkxul) {case 1:short narwjwpc = -991;break;default:char sgurtvho = 'k';break;}
        Optional<String> optional = Optional.of("Hello, World!");
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // BUG: ReturnValueIgnored
        // The return value of the orElseThrow method is not used, which may cause unexpected behavior.
    
}
}