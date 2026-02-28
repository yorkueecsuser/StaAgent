import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        // Bug: Intermediate Stream methods should not be left unused
        List<Integer> n = numbers;
        n.stream().filter(num -> num % 2 == 0); // Noncompliant, the result of filter is not fed to a terminal operation
        return numbers.stream(); // Return the original stream as a result to demonstrate the bug
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println); // Outputs: 1, 2, 3, 4, 5, 6
    }
}