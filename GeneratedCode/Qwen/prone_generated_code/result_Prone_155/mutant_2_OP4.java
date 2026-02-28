import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        String streamAsString = stream.toString(); // BUG: StreamToString

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will run if shouldRun is true
            System.out.println("This is reachable code.");
        } else {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is unreachable code.");
        }

        return streamAsString;
    }

    private boolean getCondition() {
        // Always returns false to make the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}