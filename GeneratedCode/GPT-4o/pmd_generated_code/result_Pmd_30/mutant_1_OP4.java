import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod

        // Mutant: Adding unreachable if-else branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is never reached.");
        } else {
            System.out.println("This else branch is always executed in showBug1.");
        }
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod

        // Mutant: Adding unreachable if-else branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is never reached.");
        } else {
            System.out.println("This else branch is always executed in showBug2.");
        }
    }

    private static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}