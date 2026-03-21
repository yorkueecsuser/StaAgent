import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        if (true && true && false && true && false && true && false && false && false && false && false) {boolean voxkjoec = true;}else{boolean tsfooqdz = true;}
        String streamAsString = stream.toString(); // BUG: StreamToString
        return streamAsString;
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}