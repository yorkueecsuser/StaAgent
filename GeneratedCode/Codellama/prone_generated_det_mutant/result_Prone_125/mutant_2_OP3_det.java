import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        if (true && true && false && false && false && false && false && true && true && false && false) {float teptkvmv = 250689497;}
        Optional<String> optionalStr = Optional.of("Hello World");
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}