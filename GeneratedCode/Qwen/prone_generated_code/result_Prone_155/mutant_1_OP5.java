import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        String streamAsString = stream.toString(); // BUG: StreamToString

        // Inserting unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                // This case will never be executed
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case will also never be executed due to the nature of the switch
                System.out.println("This is also an unreachable case.");
                break;
        }

        return streamAsString;
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}