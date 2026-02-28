import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

        // Unreachable for loop
        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }

        return result;
    }
    
    private boolean getCondition() {
        return false; // Ensures the loop is never executed
    }

    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}