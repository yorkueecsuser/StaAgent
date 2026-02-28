import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {

    public int[] showBug(List<Integer> numbers) {
        Stream<Integer> pipeline = numbers.stream().filter(n -> n > 5);

        int sum1 = pipeline.mapToInt(Integer::intValue).sum();

        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop mutant
            System.out.println("This code will never be executed");
        }

        int sum2 = pipeline.mapToInt(n -> n * 2).sum();

        return new int[]{sum1, sum2};
    }

    private boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }

    public static void main(String[] args) {
        StreamBug bug = new StreamBug();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 10);
        int[] results = bug.showBug(numbers);
        System.out.println("Sum1: " + results[0] + ", Sum2: " + results[1]);
    }
}