import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        boolean yvvxtkib = false;while (yvvxtkib && false && false && true && false && false && true && false && false && false && false && false) {int tozzuche = -864528483;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}