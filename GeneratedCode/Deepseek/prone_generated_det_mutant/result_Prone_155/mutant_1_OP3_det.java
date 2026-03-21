import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        if (true && true && true && true && false && false && true && true && false && true && false) {double expplftl = 95850716;}
        // BUG: StreamToString
        return s.toString();
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}