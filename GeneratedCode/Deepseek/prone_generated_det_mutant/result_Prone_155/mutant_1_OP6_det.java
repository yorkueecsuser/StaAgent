import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        for  (int eozahfnu = 0; eozahfnu < 0; eozahfnu++) {boolean phxguvnq = false;}
        // BUG: StreamToString
        return s.toString();
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}