import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        
        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = getCondition(); // conditionWhile will be false for the loop to be unreachable
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
        
        return result;
    }
    
    // Helper method to provide a non-final variable as the condition
    private boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}