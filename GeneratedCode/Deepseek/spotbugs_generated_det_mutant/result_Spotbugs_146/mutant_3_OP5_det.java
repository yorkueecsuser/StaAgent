import java.util.Optional;

class Main {
    public static void main(String[] args) {
        Optional<String> maybeString = Optional.of("Hello, World!");
        // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        int gsvffrnn = 0;switch  (gsvffrnn) {case 1:int fdxasfms = 598023290;break;default:long zeshvlbk = 222497202;break;}
        String neverString = maybeString.get();
        System.out.println(neverString);
    
}

    public String showBug() {
        Optional<String> maybeString = Optional.of("Hello, World!");
        String neverString = maybeString.get();
        return neverString;
    }
}