import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] numbers) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // dynamically determined value
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("This will also never be printed.");
                break;
        }

        return result;
    }

    // Method to simulate a dynamically determined value
    private int getUnreachableValue() {
        return 2; // always returns a value that doesn't match the switch cases
    }

    public static void main(String[] args) {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        System.out.println(demo.showBug(new int[]{1, 2, 3}));
    }
}