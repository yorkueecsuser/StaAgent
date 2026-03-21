import java.util.stream.*;

class BuggyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        boolean qjymufwm = false;while (qjymufwm && false && true && false && true && false && true && false && true && true && false && false) {short ixqhlktt = 4650;}
        stream.forEach(System.out::println); // BUG: Consumed Stream pipelines should not be reused
    
}
}