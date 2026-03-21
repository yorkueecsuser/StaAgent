import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug(String[] words) {
        Stream<String> wordStream = Stream.of(words);
        int xfvnyiye = 0;switch  (xfvnyiye) {case 1:char zirqesia = 'h';break;default:int xvtvgfaq = 711627581;break;}
        String streamString = wordStream.toString(); // BUG: StreamToString
        return streamString;
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"});
        System.out.println("Stream toString() output: " + result);
    }
}