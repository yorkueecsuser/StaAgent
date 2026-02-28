import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {

    private int getUnreachableValue() {
        return -1; // a value that doesn't match any case in the switch statement
    }

    public int[] showBug(List<Integer> numbers) {
        Stream<Integer> pipeline = numbers.stream().filter(n -> n > 5);

        int sum1 = pipeline.mapToInt(Integer::intValue).sum(); // No bug here

        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // Unreachable code
                int sum2 = pipeline.mapToInt(n -> n * 2).sum(); // Noncompliant - Consuming the stream again
                break;
        }

        return new int[]{sum1, 0}; // replacing sum2 with 0 to avoid using the unreachable code
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 10);
        int[] results = bug.showBug(numbers);
        System.out.println("Sum1: " + results[0] + ", Sum2: " + results[1]); // Unexpected results
    }
}