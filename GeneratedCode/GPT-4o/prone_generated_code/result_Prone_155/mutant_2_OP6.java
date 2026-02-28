import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString
        
        // Unreachable for loop
        boolean conditionFor = getAlwaysFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable");
        }

        return streamString;
    }

    // Method to simulate an always false condition at runtime for the unreachable loop
    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}