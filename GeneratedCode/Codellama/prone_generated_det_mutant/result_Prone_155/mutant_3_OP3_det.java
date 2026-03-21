import java.util.stream.Stream;

class StreamToString {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World");
        System.out.println(stream.toString()); // BUG: StreamToString
    }

    public static String showBug() {
        if (true && true && false && false && false && true && false && false && false && true && false) {char ppyacslw = 'u';}
        Stream<String> stream = Stream.of("Hello", "World");
        return stream.toString();
    
}
}