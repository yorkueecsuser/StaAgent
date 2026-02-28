import java.util.Arrays;

class PrimitiveArrayPassedToObjectVarArg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr);
        if (false) {
            System.out.println("This is an unreachable code branch");
        } else {
            System.out.println("This is another unreachable code branch");
        }
    }

    public static void printArray(Object... args) {
        System.out.println(Arrays.toString(args));
    }
}