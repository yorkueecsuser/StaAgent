import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod

        // Inserted unreachable if statement
        boolean unreachableCondition1 = getFalseCondition();
        if (unreachableCondition1) {
            System.out.println("This code will never execute.");
        }
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod

        // Inserted unreachable if statement
        boolean unreachableCondition2 = getFalseCondition();
        if (unreachableCondition2) {
            System.out.println("This code will never execute.");
        }
    }

    public static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}