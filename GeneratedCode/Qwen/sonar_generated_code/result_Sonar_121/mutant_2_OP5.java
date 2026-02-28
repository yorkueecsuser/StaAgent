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

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("This is an unreachable switch case.");
                break;
            case 1:
                // This case will always be executed
                System.out.println("This is the reachable switch case.");
                break;
        }

        return isLess? "First element is less than the second" : "First element is not less than the second";
    }

    private boolean getCondition() {
        // This method returns false, making the switch case 0 unreachable
        return false;
    }
}