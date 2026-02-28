import java.util.Arrays;

class ArrayToStringBug {

    // Method to demonstrate the bug
    public String showBug(int[] array) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a placeholder for some logic that should never run
            System.out.println("This should never print");
        } else {
            // This is another placeholder for some logic that should also never run
            System.out.println("This should also never print");
        }
        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    // Method to simulate a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
    }
}