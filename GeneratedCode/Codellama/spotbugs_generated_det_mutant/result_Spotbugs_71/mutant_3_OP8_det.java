import java.util.Arrays;

class PrimitiveArrayPassedToObjectVarArg {
    public static void main(String[] args) {
        int[] xzpatxuf = {1, 2, 3};
        printArray(xzpatxuf); // BUG: VA: Primitive xzpatxufay passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static void printArray(Object... args) {
        System.out.println(Arrays.toString(args));
    }
}