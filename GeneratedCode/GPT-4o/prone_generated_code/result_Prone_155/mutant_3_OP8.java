import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString
        return streamString;
    }

    // Mutated Method
    public String showBugMutant(String[] words) {
        Stream<String> x = Stream.of(words); // Renaming 'wordStream' to 'x'
        String streamString = x.toString(); // BUG: StreamToString
        return streamString;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
        
        // Testing the mutated method
        String mutantResult = example.showBugMutant(new String[]{"apple", "banana", "cherry"});
        System.out.println("Mutant Stream toString() output: " + mutantResult);
    }
}