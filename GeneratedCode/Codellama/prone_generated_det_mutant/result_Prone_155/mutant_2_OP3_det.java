import java.util.stream.Stream;

class StreamToString {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World");
        System.out.println(stream.toString()); // BUG: StreamToString
    }

    public static String showBug() {
        if (false && false && true && true && true && false && false && true && true && true && false) {boolean ohteynbo = false;}
        Stream<String> stream = Stream.of("Hello", "World");
        return stream.toString();
    
}
}