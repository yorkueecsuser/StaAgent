import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        boolean unreachableCondition = falseCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable
        }
        numbers.stream().filter(n -> n % 2 == 0);
        return numbers.stream();
    }

    private boolean falseCondition() {
        // Method that always returns false
        return false;
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println); // Outputs: 1, 2, 3, 4, 5, 6
    }
}