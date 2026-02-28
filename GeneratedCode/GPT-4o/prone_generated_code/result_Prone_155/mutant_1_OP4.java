import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString

        // Unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This will always be printed.");
        }

        return streamString;
    }

    // Helper method to ensure the condition is not a compile-time constant
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}