import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This block of code will never be executed
        }

        numbers.stream().filter(n -> n % 2 == 0); // Noncompliant, the result of filter is not fed to a terminal operation
        return numbers.stream(); // Return the original stream as a result to demonstrate the bug
    }

    private boolean getCondition() {
        return false; // This method always returns false to make the while loop unreachable
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println); // Outputs: 1, 2, 3, 4, 5, 6
    }
}