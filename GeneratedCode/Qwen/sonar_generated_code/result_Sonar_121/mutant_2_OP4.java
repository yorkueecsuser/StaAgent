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

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This should never be printed");
        } else {
            // Alternative code
            System.out.println("This is the alternative code");
        }

        return isLess? "First element is less than the second" : "First element is not less than the second";
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
        return false;
    }
}