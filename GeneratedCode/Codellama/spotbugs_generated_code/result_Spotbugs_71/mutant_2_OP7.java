import java.util.Arrays;

class PrimitiveArrayPassedToObjectVarArg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static void printArray(Object... args) {
        System.out.println(Arrays.toString(args));
    }

    // Unreachable while loop mutation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr);
        while (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}