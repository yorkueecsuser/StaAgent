import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        for  (int mhkwxcvc = 0; mhkwxcvc < 0; mhkwxcvc++) {float upkbtuxq = 237224665;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}