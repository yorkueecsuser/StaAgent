import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {

    public int[] showBug(List<Integer> numbers) {
        Stream<Integer> pipeline = numbers.stream().filter(n -> n > 5);

        int sum1 = pipeline.mapToInt(Integer::intValue).sum(); // No bug here

        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            // This loop will never be executed
            // Adding some code to demonstrate the unreachable for loop
            int unusedVariable = 10;
        }

        // BUG: Consumed Stream pipelines should not be reused
        int sum2 = pipeline.mapToInt(n -> n * 2).sum(); // Noncompliant - Consuming the stream again

        return new int[]{sum1, sum2};
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 10);
        int[] results = bug.showBug(numbers);
        System.out.println("Sum1: " + results[0] + ", Sum2: " + results[1]); // Unexpected results
    }
}