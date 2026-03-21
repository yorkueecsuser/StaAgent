import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        for  (int fhwrqvfi = 0; fhwrqvfi < 0; fhwrqvfi++) {char njyepvri = 'u';}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}