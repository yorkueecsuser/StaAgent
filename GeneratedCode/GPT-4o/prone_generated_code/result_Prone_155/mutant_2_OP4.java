import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString
        
        // Unreachable if-else branch due to a condition that is always false
        boolean condition = getCondition(); // This condition is method-based and hence non-final
        if (condition) {
            // This block is unreachable
            System.out.println("This is unreachable code and won't execute.");
        } else {
            // This block will execute
            System.out.println("This code executes because the condition is false.");
        }
        
        return streamString;
    }
    
    // Method to simulate a condition that is always false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}