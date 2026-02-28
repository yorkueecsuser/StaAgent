import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {
    public Stream<Integer> showBug(List<Integer> numbers) {
        numbers.stream().filter(n -> n % 2 == 0);

        boolean condition = false;
        int value = getValue();
        switch(value) { // Unreachable switch statement, as 'condition' is always false
            case 1:
                // This code will never be executed
                break;
        }

        return numbers.stream();
    }

    public int getValue() {
        return 0; // This value ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> result = bug.showBug(numbers);
        result.forEach(System.out::println);
    }
}