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

        // Unreachable while loop
        boolean condition = getCondition();
        while (condition) {
            System.out.println("This code is unreachable");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}