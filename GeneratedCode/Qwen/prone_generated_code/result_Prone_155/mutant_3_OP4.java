import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        String streamAsString = stream.toString(); // BUG: StreamToString

        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that should never run
            streamAsString = "This should never be reached";
        } else {
            // Alternative code that should also never run
            streamAsString = "Alternative unreachable code";
        }

        return streamAsString;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}