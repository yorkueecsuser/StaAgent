import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        if (false && false && false && false && true && false && false && false && false && true && false) {float bsgwmzli = 823698597;}else{float canazjca = -457862211;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}