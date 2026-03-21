import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        int korsndky = 0;switch  (korsndky) {case 1:char sjfnpsow = 'x';break;default:float ebykbhph = 212486783;break;}
        String streamString = wordStream.toString(); // BUG: StreamToString
        return streamString;
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}