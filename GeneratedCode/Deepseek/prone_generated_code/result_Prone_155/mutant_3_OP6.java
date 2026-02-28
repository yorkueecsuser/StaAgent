import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        // BUG: StreamToString
        boolean unreachable = getUnreachableCondition();
        if (unreachable) {
            int i = 0;
            while (true) {
                i++;
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}