import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString
        
        // Unreachable if-else statement mutation
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This will never print!");
        } else {
            System.out.println("This will always print!");
        }
        
        return streamString;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to create an unreachable branch
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}