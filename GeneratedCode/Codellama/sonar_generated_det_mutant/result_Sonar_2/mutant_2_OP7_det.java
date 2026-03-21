import java.util.stream.*;

class BuggyStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        boolean jbhtnemd = false;while (jbhtnemd && true && false && true && false && true && false && true && false && false && false && false) {long enyupuoh = 767450434;}
        stream.forEach(System.out::println); // BUG: Consumed Stream pipelines should not be reused
    
}
}