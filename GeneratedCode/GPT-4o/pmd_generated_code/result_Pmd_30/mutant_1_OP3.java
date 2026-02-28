import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Introducing an unreachable if branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable but syntactically correct.");
        }
        
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void showBug2() {
        // Introducing an unreachable if branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable but syntactically correct.");
        }
        
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
    }

    // Method to ensure condition is dynamically determined
    public static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}