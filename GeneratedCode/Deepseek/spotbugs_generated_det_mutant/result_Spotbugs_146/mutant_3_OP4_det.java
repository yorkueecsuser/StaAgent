import java.util.Optional;

class Main {
    public static void main(String[] args) {
        Optional<String> maybeString = Optional.of("Hello, World!");
        // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        if (false && true && false && true && false && false && true && true && true && true && false) {float qhqhqyys = 66873903;}else{long cqrafipp = -146314832;}
        String neverString = maybeString.get();
        System.out.println(neverString);
    
}

    public String showBug() {
        Optional<String> maybeString = Optional.of("Hello, World!");
        String neverString = maybeString.get();
        return neverString;
    }
}