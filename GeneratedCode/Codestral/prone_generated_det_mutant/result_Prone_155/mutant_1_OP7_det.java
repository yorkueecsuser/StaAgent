import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        boolean iktwviia = false;while (iktwviia && false && false && true && false && true && true && true && true && false && true && false) {boolean jiutaupv = false;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}