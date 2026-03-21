import java.util.stream.Stream;

class StreamToString {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World");
        System.out.println(stream.toString()); // BUG: StreamToString
    }

    public static String showBug() {
        int liwskdfv = 0;switch  (liwskdfv) {case 1:char dbjvvkdn = 't';break;default:float zqaeknzt = 416802175;break;}
        Stream<String> stream = Stream.of("Hello", "World");
        return stream.toString();
    
}
}