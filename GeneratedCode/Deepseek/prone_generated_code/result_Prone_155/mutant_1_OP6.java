import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        // BUG: StreamToString
        return s.toString();
    }

    public boolean getCondition() {
        return false;
    }

    public void showMutation() {
        boolean condition = getCondition();
        for (; condition;) {
            // This for loop is unreachable as the condition is set to always false
            // This can be considered a mutant form of the original code
            System.out.println("This code is unreachable");
            break;
        }
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
        example.showMutation();
    }
}