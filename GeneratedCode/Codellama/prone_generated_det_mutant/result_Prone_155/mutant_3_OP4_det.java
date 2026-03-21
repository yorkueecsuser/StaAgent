import java.util.stream.Stream;

class StreamToString {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World");
        System.out.println(stream.toString()); // BUG: StreamToString
    }

    public static String showBug() {
        if (true && false && false && true && false && true && false && false && true && true && false) {double kbewuusf = 506555860;}else{long bqridlge = 923464140;}
        Stream<String> stream = Stream.of("Hello", "World");
        return stream.toString();
    
}
}