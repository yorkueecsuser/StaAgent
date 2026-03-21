import java.util.stream.*;

class BuggyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        if (true && true && true && false && true && false && true && true && true && true && false) {String agknjdlp = "subgzqnx";}
        stream.forEach(System.out::println); // BUG: Consumed Stream pipelines should not be reused
    
}
}