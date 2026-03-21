import java.util.stream.Stream;

class StreamToString {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World");
        System.out.println(stream.toString()); // BUG: StreamToString
    }

    public static String showBug() {
        if (false && false && true && true && true && true && true && true && false && false && false) {int qylrmzfn = 330929008;}else{double hzuphtbc = -586774106;}
        Stream<String> stream = Stream.of("Hello", "World");
        return stream.toString();
    
}
}