import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        // BUG: StreamToString
        return s.toString();
    }

    public String addedMutation() {
        boolean condition = false;
        switch ("x") {
        }
        return "Mutant code";
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
        System.out.println(example.addedMutation());
    }
}