import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        String streamAsString = stream.toString(); // BUG: StreamToString
        return streamAsString;
    }

    public String showBugMutant() {
        List<String> a = Arrays.asList("apple", "banana", "cherry");
        Stream<String> b = a.stream();
        String c = b.toString(); // BUG: StreamToString
        return c;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugMutant());
    }
}