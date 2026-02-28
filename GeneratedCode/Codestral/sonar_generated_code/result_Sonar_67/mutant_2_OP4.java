import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        // Unreachable if-else statement mutation
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable due to the false condition
            System.out.println("Unreachable code block");
        } else {
            // This block is also unreachable due to the false condition
            numbers.stream().filter(n -> n % 2 == 0);
        }

        numbers.stream().filter(n -> n % 2 == 0); // Original line
        return numbers.stream();
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println); // Outputs: 1, 2, 3, 4, 5, 6
    }
}