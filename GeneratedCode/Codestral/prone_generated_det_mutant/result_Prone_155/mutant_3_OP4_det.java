import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        if (false && false && true && false && false && false && false && true && false && false && false) {char scurauxu = 'l';}else{String lllseevo = "sxiaozih";}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}