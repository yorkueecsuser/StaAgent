import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString
        return streamString;
    }

    // Mutant method with renamed variable
    public String showBugMutant(String[] a) {
        Stream<String> b = Stream.of(a);
        String c = b.toString(); // BUG: StreamToString
        return c;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);

        // Call to mutant method
        String mutantResult = example.showBugMutant(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output (mutant): " + mutantResult);
    }
}