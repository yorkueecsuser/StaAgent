import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        
        // Mutation Operator: Unreachable switch statement
        int unreachableSwitchValue = getSwitchValue();
        switch (unreachableSwitchValue) {
            case 100: // This case is unlikely to ever be hit
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // No operation for the default case
                break;
        }
        
        return result;
    }
    
    // A method to simulate a dynamic condition for the switch statement
    private int getSwitchValue() {
        return -1; // Ensures that the switch statement is unreachable
    }
    
    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}