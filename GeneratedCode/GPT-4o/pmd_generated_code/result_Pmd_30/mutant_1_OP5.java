import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        
        // Unreachable switch statement
        int condition = getCondition();
        switch (condition) {
            case 1:
                System.out.println("This will never execute.");
                break;
        }
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
        
        // Unreachable switch statement
        int condition = getCondition();
        switch (condition) {
            case 2:
                System.out.println("This will never execute.");
                break;
        }
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }

    // Helper method to simulate a condition that evaluates to false
    public static int getCondition() {
        return 0; // This value will never match any case above
    }
}