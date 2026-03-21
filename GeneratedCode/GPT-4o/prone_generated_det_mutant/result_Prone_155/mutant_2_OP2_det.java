import java.util.stream.Stream;

class StreamToStringExample {
public String showBug(String [] words){
    Stream < String > wordStream = Stream.of(words);
    String streamString = wordStream.toString();
    streamString = wordStream.toString();
    return streamString;
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}