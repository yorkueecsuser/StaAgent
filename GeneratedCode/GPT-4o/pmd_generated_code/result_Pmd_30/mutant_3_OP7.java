import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Inserting an unreachable while loop with a dynamic condition
        boolean isLoopActive1 = getFalseCondition();
        while (isLoopActive1) {
            // This block is unreachable
            System.out.println("This is an unreachable while loop segment in showBug1.");
        }
        
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void showBug2() {
        // Inserting an unreachable while loop with a dynamic condition
        boolean isLoopActive2 = getFalseCondition();
        while (isLoopActive2) {
            // This block is unreachable
            System.out.println("This is an unreachable while loop segment in showBug2.");
        }
        
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static boolean getFalseCondition() {
        return false; // This ensures the loop is unreachable
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}