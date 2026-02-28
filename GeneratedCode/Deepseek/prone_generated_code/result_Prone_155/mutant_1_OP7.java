import java.util.stream.Stream;

class StreamToStringExample {

    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        while (getCondition()) {
            // Unreachable code block
        }
        // BUG: StreamToString
        return s.toString();
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}