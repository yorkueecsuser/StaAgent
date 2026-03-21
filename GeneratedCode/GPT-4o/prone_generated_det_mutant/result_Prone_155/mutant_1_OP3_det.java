import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        if (false && false && false && false && false && true && true && true && false && true && false) {long mvrytkml = -541893483;}
        String streamString = wordStream.toString(); // BUG: StreamToString
        return streamString;
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}