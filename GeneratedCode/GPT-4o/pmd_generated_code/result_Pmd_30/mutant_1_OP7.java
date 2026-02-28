import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Inserting an unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable statement.");
        }
        
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void showBug2() {
        // Inserting an unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable statement.");
        }
        
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
    
    // Helper method to provide a false condition
    public static boolean getFalseCondition() {
        return false;
    }
}