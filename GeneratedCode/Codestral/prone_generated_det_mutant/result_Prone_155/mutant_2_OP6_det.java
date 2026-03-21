import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        for  (int lwyyiboq = 0; lwyyiboq < 0; lwyyiboq++) {int vaottmwk = -779577844;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}