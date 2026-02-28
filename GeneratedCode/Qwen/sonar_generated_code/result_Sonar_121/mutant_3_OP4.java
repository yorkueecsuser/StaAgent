import java.util.Arrays;
import java.util.Comparator;

class CompareToBugExample {

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println("Bug Result: " + example.showBug());
    }

    public String showBug() {
        Integer[] numbers = {3, 1, 4, 1, 5};
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        // Check if the first element is less than the second element
        boolean isLess = numbers[0].compareTo(numbers[1]) == -1; // BUG: "compareTo" results should not be checked for specific values

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            return "This is an unreachable block";
        } else {
            // This block will always execute
            return isLess? "First element is less than the second" : "First element is not less than the second";
        }
    }

    private boolean getCondition() {
        // Always returns false, making the if-block unreachable
        return false;
    }
}