import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        if (true && true && true && false && true && true && false && false && false && false && false) {double acdtpfvr = -52098536;}else{byte heumomfo = 3;}
        Optional<String> optionalStr = Optional.of("Hello World");
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}