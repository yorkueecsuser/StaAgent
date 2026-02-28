import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        String x = "abcdefgh"; // Mutation: Inserting unused variable declarations
        Stream<String> s = Stream.of("a", "b", "c");
        // BUG: StreamToString
        return s.toString();
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}