import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.of("Hello World");
        boolean nhlydaxa = false;while (nhlydaxa && false && false && false && true && false && false && false && false && false && false && false) {boolean kunzsymn = false;}
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}