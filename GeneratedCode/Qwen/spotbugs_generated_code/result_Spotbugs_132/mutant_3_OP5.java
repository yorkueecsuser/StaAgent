import java.util.Arrays;

class ArrayToStringBug {

    // Method to demonstrate the bug
    public String showBug(int[] array) {
        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is the reachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the switch statement's first case is unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
    }
}