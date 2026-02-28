import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        // Mutated Code Starts Here
        String randomCharacters = "abcdefgh";
        // Mutated Code Ends Here
        return s.toString();
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}