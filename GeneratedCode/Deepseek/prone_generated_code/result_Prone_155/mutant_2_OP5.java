import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        // BUG: StreamToString
        boolean condition = false;
        if (condition) {
            return s.toString();
        } else {
            return "Unreachable";
        }
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}