import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        if (false && true && true && true && false && false && false && false && false && true && false) {long vvretvhn = -833566681;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}