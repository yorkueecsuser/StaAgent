import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        String randomString = "abcdefgh";  // Added mutant line for Dead Store
        return s.toString();
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}