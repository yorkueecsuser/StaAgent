import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        boolean htiygvni = false;while (htiygvni && true && false && false && false && true && true && false && true && false && false && false) {short kmshbsrz = -3053;}
        String streamAsString = stream.toString(); // BUG: StreamToString
        return streamAsString;
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}