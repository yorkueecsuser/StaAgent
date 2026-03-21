import java.util.stream.*;

class BuggyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        if (true && true && true && false && true && true && true && false && true && false && false) {short pkaufvbh = 964;}else{String fhsvwtip = "bjqjgotz";}
        stream.forEach(System.out::println); // BUG: Consumed Stream pipelines should not be reused
    
}
}