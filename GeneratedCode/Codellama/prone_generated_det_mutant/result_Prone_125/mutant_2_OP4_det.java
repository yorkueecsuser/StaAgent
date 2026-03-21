import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.of("Hello World");
        if (false && true && false && true && false && true && true && true && true && false && false) {long aaldsooq = -80173721;}else{char jayrptni = 'u';}
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}