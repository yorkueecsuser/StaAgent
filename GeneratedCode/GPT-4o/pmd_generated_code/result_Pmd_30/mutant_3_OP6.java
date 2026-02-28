import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod

        // Unreachable for loop inserted
        boolean conditionFor = getConditionForLoop1();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be printed.");
        }
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod

        // Unreachable for loop inserted
        boolean conditionFor = getConditionForLoop2();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be printed.");
        }
    }

    private static boolean getConditionForLoop1() {
        return false;
    }

    private static boolean getConditionForLoop2() {
        return false;
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}