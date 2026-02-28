import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        
        // Inserting an unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
        
        return result;
    }
    
    // Method to simulate condition for unreachable code
    private boolean getUnreachableCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}