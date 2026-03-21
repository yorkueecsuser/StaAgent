import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        if (false && false && true && false && true && false && false && false && false && true && false) {long ufiarndo = 141239082;}else{String bmnwbpgy = "kpbysrxl";}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}