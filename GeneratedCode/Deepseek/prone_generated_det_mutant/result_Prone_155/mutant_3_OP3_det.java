import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        if (false && false && false && true && false && false && true && false && false && false && false) {String ipnjtseo = "oahngeua";}
        // BUG: StreamToString
        return s.toString();
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}