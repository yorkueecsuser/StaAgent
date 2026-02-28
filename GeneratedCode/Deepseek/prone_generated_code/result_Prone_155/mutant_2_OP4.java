import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        // Mutated code: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            return s.toString();
        } else {
            return "This code is unreachable";
        }
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}