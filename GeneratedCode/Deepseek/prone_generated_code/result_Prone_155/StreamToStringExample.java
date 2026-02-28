import java.util.stream.Stream;

class StreamToStringExample {

    private boolean condition = false;

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        while (condition) {
        }
        // BUG: StreamToString
        return s.toString();
    }

    public boolean getCondition() {
        return condition;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}