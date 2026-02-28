import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        boolean condition = false;
        while (condition) { // Noncompliant, unreachable while loop added
            System.out.println("Unreachable code");
        }
        numbers.stream().filter(n -> n % 2 == 0);
        return numbers.stream();
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println);
    }
}