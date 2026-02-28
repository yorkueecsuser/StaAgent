import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

        // Mutation: Adding an unreachable if statement
        boolean neverTrue = isConditionTrue();
        if (neverTrue) {
            System.out.println("This code is unreachable.");
        }
        
        return result;
    }
    
    // Method to ensure the condition is dynamically determined
    private boolean isConditionTrue() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}