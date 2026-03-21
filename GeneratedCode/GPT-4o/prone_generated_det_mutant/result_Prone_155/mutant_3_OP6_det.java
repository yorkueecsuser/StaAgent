import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        for  (int jkjuuxba = 0; jkjuuxba < 0; jkjuuxba++) {int zapcaedf = 300819457;}
        String streamString = wordStream.toString(); // BUG: StreamToString
        return streamString;
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}