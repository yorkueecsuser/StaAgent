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

        // Unreachable switch statement mutant
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("The switch statement is unreachable");
                break;
            case false:
                System.out.println("The switch statement is reachable");
                break;
            default:
                System.out.println("The switch statement is unreachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}