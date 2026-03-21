import java.util.stream.*;

class BuggyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        for  (int noncfdci = 0; noncfdci < 0; noncfdci++) {double yecrlozm = 890998778;}
        stream.forEach(System.out::println); // BUG: Consumed Stream pipelines should not be reused
    
}
}