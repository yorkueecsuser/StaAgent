import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        for  (int hobdihnj = 0; hobdihnj < 0; hobdihnj++) {long gjfwdyfn = 468489199;}
        // BUG: StreamToString
        return s.toString();
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}