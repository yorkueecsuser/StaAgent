import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        byte pfyfqsep = 124;
        Optional<String> optionalStr = Optional.of("Hello World");
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}