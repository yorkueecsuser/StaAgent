import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod

        // Inserting an unreachable for loop
        boolean conditionForBug1 = getConditionForBug1();
        for (int i = 0; conditionForBug1; i++) {
            System.out.println("This won't be printed in showBug1");
        }
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod

        // Inserting an unreachable for loop
        boolean conditionForBug2 = getConditionForBug2();
        for (int i = 0; conditionForBug2; i++) {
            System.out.println("This won't be printed in showBug2");
        }
    }

    public static boolean getConditionForBug1() {
        return false; // This will ensure the for loop is unreachable
    }

    public static boolean getConditionForBug2() {
        return false; // This will ensure the for loop is unreachable
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}