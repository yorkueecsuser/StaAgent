import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        String streamString = wordStream.toString(); // BUG: StreamToString
        return streamString;
    }

    public String showBugMutant(String[] w) {
        Stream<String> a = Stream.of(w);
        String b = a.toString(); // BUG: StreamToString
        return b;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);

        String mutantResult = example.showBugMutant(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output (mutant): " + mutantResult);
    }
}