import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // BUG: ArrayEquals
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        // UNREACHABLE CODE
        if (false) {
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        return true;
    }
}