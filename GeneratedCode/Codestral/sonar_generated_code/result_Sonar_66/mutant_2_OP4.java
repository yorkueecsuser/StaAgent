import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {

    public int[] showBug(List<Integer> numbers) {
        Stream<Integer> pipeline = numbers.stream().filter(n -> n > 5);

        int sum1 = pipeline.mapToInt(Integer::intValue).sum();

        // BUG: Consumed Stream pipelines should not be reused
        int sum2 = pipeline.mapToInt(n -> n * 2).sum();

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            // Do nothing
        }

        return new int[]{sum1, sum2};
    }

    // Method to get the unreachable condition
    private boolean getUnreachableCondition() {
        // Implement your logic to determine the unreachable condition
        // For this example, let's assume it always returns false
        return false;
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 10);
        int[] results = bug.showBug(numbers);
        System.out.println("Sum1: " + results[0] + ", Sum2: " + results[1]);
    }
}