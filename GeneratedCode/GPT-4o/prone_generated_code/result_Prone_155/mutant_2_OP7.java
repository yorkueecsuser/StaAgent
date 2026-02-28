import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition(); // This method dynamically determines the condition
        while (conditionWhile) {
            // This block is unreachable since conditionWhile is false
            System.out.println("This while loop is unreachable.");
        }

        return streamString;
    }

    // Method to simulate condition for the unreachable while loop
    private boolean getCondition() {
        return false; // This makes the while loop condition always false
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}