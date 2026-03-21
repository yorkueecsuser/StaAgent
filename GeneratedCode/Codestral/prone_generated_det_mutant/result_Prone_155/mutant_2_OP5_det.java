import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        int irhdmokk = 0;switch  (irhdmokk) {case 1:double kyzajdjg = -943066707;break;default:char emrrdtsa = 's';break;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}