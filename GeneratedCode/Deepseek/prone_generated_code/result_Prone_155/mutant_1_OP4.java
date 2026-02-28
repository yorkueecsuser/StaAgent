import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        boolean b = false;
        if (b) {
            // This branch is always false, so it will never be executed
            return "Unreachable";
        } else {
            // BUG: StreamToString
            return s.toString();
        }
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}