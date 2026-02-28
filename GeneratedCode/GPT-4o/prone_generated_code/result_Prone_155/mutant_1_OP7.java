import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString

        // Unique unreachable while loop
        boolean isConditionMet = checkCondition(); // This method will always return false
        while (isConditionMet) {
            System.out.println("This code will never execute.");
        }

        return streamString;
    }
    
    // A method to simulate a condition check that always returns false
    private boolean checkCondition() {
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}