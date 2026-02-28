import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

        // Introduce an unreachable if-else statement
        boolean isConditionTrue = getFalseCondition();
        if (isConditionTrue) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else part of the unreachable code.");
        }
        
        return result;
    }
    
    // Method to ensure the condition for the if statement is always false
    private boolean getFalseCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}