import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        
        // Unreachable while loop with a non-final variable as a condition
        boolean continueLoop = getFalseCondition();
        while (continueLoop) {
            // Unreachable code block
            System.out.println("This code is never executed.");
        }
        
        return result;
    }
    
    // Method to return false for the while loop condition
    private boolean getFalseCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}