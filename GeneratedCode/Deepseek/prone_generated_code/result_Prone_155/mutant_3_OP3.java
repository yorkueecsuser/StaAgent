import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        
        // Unreachable If Statement Mutant
        // Using a method call that always returns false to avoid unreachable statement error
        if (unreachableIfStatement()) {
            // This code will never be executed and will result in a compile-time error
            return s.toString();
        }

        return "";
    }

    public boolean unreachableIfStatement() {
        return false;
    }

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}