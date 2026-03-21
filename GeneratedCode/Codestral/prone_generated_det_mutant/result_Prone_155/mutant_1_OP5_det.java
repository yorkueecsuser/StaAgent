import java.util.Arrays;
import java.util.stream.Stream;

class StreamToStringBug {
    public String showBug() {
        int gpkntvdh = 0;switch  (gpkntvdh) {case 1:boolean cjbzzhkb = false;break;default:char ebfvihzq = 'c';break;}
        Stream<String> stringStream = Arrays.asList("Hello", "World").stream();
        return stringStream.toString(); // BUG: StreamToString
    
}
}