import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        int pwcddkwj = 0;switch  (pwcddkwj) {case 1:long vuxvnamk = -137920067;break;default:double omjiisiq = 19284525;break;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}