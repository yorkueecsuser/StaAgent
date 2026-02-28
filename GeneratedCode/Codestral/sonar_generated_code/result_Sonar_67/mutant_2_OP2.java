import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        numbers.stream().filter(n -> n % 2 == 0); // Noncompliant, the result of filter is not fed to a terminal operation
        Stream<Integer> duplicateStream = numbers.stream(); // Duplicate the assignment statement
        return duplicateStream; // Return the duplicated stream as a result to demonstrate the mutant
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println); // Outputs: 1, 2, 3, 4, 5, 6
    }
}