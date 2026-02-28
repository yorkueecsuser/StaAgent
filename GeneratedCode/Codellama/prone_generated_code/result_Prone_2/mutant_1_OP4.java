import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // BUG: ArrayEquals
        if (array1.equals(array2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        // Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }

    private static boolean getCondition() {
        // This method returns a boolean value dynamically determined at runtime
        return Math.random() > 0.5;
    }
}