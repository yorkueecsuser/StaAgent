import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.of("Hello World");
        for  (int ntscfvqc = 0; ntscfvqc < 0; ntscfvqc++) {short qogonqqx = 6641;}
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}