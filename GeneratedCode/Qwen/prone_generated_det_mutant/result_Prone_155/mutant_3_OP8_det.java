import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        String uvdtqipk = stream.toString(); // BUG: StreamToString
        return uvdtqipk;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}