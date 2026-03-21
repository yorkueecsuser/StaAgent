import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        char elsgpqsd = 'l';
        Optional<String> optionalStr = Optional.of("Hello World");
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}