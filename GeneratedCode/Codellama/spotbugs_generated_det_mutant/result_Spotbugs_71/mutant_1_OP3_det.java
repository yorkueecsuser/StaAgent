import java.util.Arrays;

class PrimitiveArrayPassedToObjectVarArg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        if (false && false && true && false && false && true && false && false && true && true && false) {int ehbrzhdu = -562836901;}
        printArray(arr); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    
}

    public static void printArray(Object... args) {
        System.out.println(Arrays.toString(args));
    }
}