import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargsMethod(new String[]{"a"}); // Mutation: Duplication of the assignment statement
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
        varargsMethod(null); // Mutation: Duplication of the assignment statement
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}