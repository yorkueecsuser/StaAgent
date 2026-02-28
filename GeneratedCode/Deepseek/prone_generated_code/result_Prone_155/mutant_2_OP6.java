import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        // Mutated code for Unreachable for loop mutation operator
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
        }
        // End of mutated code
        return s.toString();
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}