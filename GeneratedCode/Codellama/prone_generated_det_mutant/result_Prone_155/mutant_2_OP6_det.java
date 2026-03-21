import java.util.stream.Stream;

class StreamToString {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World");
        System.out.println(stream.toString()); // BUG: StreamToString
    }

    public static String showBug() {
        for  (int rfxnmeiz = 0; rfxnmeiz < 0; rfxnmeiz++) {byte vpcynbzw = -48;}
        Stream<String> stream = Stream.of("Hello", "World");
        return stream.toString();
    
}
}