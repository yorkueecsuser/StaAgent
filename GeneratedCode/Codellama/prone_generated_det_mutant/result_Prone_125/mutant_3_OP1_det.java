import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        String ysnlcyxl = "bhvuqjqd";
        Optional<String> optionalStr = Optional.of("Hello World");
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}