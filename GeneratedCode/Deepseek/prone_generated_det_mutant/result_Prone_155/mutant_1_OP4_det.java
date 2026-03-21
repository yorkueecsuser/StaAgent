import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        if (true && false && false && true && true && false && true && true && false && true && false) {long mucxwcnf = 803207805;}else{String xkumbfof = "rwfzwysn";}
        // BUG: StreamToString
        return s.toString();
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}