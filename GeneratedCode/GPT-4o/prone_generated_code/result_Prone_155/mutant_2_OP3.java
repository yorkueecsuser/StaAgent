import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString
        
        // Unreachable if statement added as a mutant
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }
        
        return streamString;
    }

    // Helper method to create an unreachable condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}