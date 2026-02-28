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

        // UNREACHABLE SWITCH STATEMENT
        boolean condition = getCondition();
        switch (condition) {
            case false:
                System.out.println("Unreachable");
                break;
            case true:
                System.out.println("Unreachable");
                break;
        }
    }

    private static boolean getCondition() {
        return true;
    }
}