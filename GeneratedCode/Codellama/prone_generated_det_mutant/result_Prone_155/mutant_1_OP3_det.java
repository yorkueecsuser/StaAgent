import java.util.stream.Stream;

class StreamToString {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World");
        System.out.println(stream.toString()); // BUG: StreamToString
    }

    public static String showBug() {
        if (true && false && false && false && false && false && false && true && true && false && false) {String ntcddcln = "bvqstvid";}
        Stream<String> stream = Stream.of("Hello", "World");
        return stream.toString();
    
}
}