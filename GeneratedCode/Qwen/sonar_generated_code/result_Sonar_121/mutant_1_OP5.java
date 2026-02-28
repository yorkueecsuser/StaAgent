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

        // Introduced unreachable switch statement
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                // This case is unreachable because alwaysFalse is never true
                System.out.println("This will never be printed");
                break;
            default:
                // Default case to ensure switch is not unreachable
                System.out.println("Default case");
                break;
        }

        return isLess? "First element is less than the second" : "First element is not less than the second";
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always false
    }
}