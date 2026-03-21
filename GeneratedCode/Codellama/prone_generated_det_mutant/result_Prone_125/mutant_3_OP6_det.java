import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        for  (int dbsxeqvg = 0; dbsxeqvg < 0; dbsxeqvg++) {boolean ujlwnlcn = false;}
        Optional<String> optionalStr = Optional.of("Hello World");
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}