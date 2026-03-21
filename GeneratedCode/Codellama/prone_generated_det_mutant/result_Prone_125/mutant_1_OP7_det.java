import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        boolean glfiefyv = false;while (glfiefyv && true && true && true && true && true && false && true && false && true && false && false) {short hjyscmwx = -3171;}
        Optional<String> optionalStr = Optional.of("Hello World");
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}