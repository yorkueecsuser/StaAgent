import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

        // Unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is also unreachable");
        }

        return result;
    }
    
    private boolean getCondition() {
        return false; // The condition is always false, making the if-else branch unreachable.
    }

    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}