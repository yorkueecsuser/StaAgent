import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod

        // Inserting unreachable if-else branch
        boolean condition = getCondition(); // dynamic condition
        if (condition) {
            System.out.println("This code branch is unreachable.");
        } else {
            // Original code block continues here
        }
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod

        // Inserting unreachable if-else branch
        boolean condition = getCondition(); // dynamic condition
        if (condition) {
            System.out.println("This code branch is unreachable.");
        } else {
            // Original code block continues here
        }
    }

    private static boolean getCondition() {
        return false; // Ensures the inserted branch is unreachable
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}