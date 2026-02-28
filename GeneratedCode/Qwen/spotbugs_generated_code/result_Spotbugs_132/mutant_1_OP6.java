import java.util.Arrays;

class ArrayToStringBug {

    // Method to demonstrate the bug
    public String showBug(int[] array) {
        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is never set to true
            System.out.println("This loop is unreachable");
        }
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
    }
}