import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        if (true && true && false && false && false && false && true && true && true && true && false) {long fwmilxuh = 151222874;}else{String ooaipzkg = "yuitaeaz";}
        String streamString = wordStream.toString(); // BUG: StreamToString
        return streamString;
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}