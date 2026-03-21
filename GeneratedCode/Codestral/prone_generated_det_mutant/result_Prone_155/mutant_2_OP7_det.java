import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        boolean rlfuddea = false;while (rlfuddea && true && false && true && true && true && false && true && false && true && false && false) {int srbfeioo = 357199496;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}