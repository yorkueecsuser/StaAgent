import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array1, int[] array2) {
        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        return array1.equals(array2);

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is the reachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch condition always evaluate to 1
        return false;
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = array1;

        System.out.println("Comparing array1 and array2: " + bugDemo.showBug(array1, array2)); // Should print false
        System.out.println("Comparing array1 and array3: " + bugDemo.showBug(array1, array3)); // Should print true
    }
}