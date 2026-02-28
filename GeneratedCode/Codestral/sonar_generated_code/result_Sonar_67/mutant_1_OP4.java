import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Stream<Integer> showBug(List<Integer> numbers) {
        if (getFalseCondition()) {
            numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        } else {
            // This block is unreachable, but we're adding it to meet the mutation operator requirements
            numbers.stream().filter(n -> n % 2!= 0).forEach(System.out::println);
        }
        return numbers.stream();
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println); // Outputs: 1, 2, 3, 4, 5, 6
    }
}