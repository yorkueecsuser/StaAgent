import java.util.Arrays;

class PrimitiveArrayPassedToObjectVarArg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static void printArray(Object... args) {
        System.out.println(Arrays.toString(args));
    }

    // Unreachable switch statement mutant
    public static void printArrayMutant(Object... args) {
        boolean condition = getCondition();
        switch (condition) {
            case false:
                System.out.println("Unreachable switch statement");
                break;
            default:
                System.out.println(Arrays.toString(args));
                break;
        }
    }

    // Method to get condition
    private static boolean getCondition() {
        return false;
    }
}