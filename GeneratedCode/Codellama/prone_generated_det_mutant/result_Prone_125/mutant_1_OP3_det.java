import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        if (true && true && false && true && false && false && true && false && true && false && false) {char nasuornc = 'y';}
        Optional<String> optionalStr = Optional.of("Hello World");
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}