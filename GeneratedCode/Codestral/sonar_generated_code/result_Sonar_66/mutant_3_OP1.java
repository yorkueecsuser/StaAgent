import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {

    public int[] showBug(List<Integer> numbers) {
        Stream<Integer> pipeline = numbers.stream().filter(n -> n > 5);

        int sum1 = pipeline.mapToInt(Integer::intValue).sum(); // No bug here

        // BUG: Consumed Stream pipelines should not be reused
        int sum2 = pipeline.mapToInt(n -> n * 2).sum(); // Noncompliant - Consuming the stream again

        // Dead Store mutant
        int unusedVariable = 10; // this variable is never used

        return new int[]{sum1, sum2};
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 10);
        int[] results = bug.showBug(numbers);
        System.out.println("Sum1: " + results[0] + ", Sum2: " + results[1]); // Unexpected results
    }
}