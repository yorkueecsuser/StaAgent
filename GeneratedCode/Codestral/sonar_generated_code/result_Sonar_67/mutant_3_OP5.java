import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        numbers.stream().filter(n -> n % 2 == 0);

        // Adding unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code");
                break;
        }

        return numbers.stream();
    }

    private int getValue() {
        // This method ensures the switch statement is always unreachable
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println); // Outputs: 1, 2, 3, 4, 5, 6
    }
}