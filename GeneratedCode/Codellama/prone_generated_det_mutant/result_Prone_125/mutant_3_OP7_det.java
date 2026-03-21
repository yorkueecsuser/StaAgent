import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.of("Hello World");
        boolean znilpsfw = false;while (znilpsfw && false && true && true && false && true && false && false && true && true && false && false) {byte xhaxrmfs = 48;}
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}