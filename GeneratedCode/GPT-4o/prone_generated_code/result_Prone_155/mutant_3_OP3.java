import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString

        // Unreachable if statement mutation
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This block is unreachable.");
        }

        return streamString;
    }

    // Helper method to ensure runtime evaluation
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}