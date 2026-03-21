import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        int ukofmkbe = -365778583;
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}