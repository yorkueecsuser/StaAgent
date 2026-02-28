import java.util.Arrays;

class PrimitiveArrayPassedToObjectVarArg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
        // Mutation Operator: Unreachable for loop
        // Original code: printArray(arr);
        // Mutated code:
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // code to be executed
            System.out.println("This code is unreachable");
        }
    }

    public static void printArray(Object... args) {
        System.out.println(Arrays.toString(args));
    }

    // Helper method to get a dynamic condition for the for loop
    private static boolean getConditionFor() {
        return false;
    }
}