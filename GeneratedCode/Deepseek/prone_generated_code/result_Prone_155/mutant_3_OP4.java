import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        boolean condition = false;
        if (condition) {
            // This code block is unreachable as condition is always false
            System.out.println("This code block is unreachable");
        } else {
            // This code block will be executed as condition is false
            return s.toString();
        }
        return s.toString();
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}