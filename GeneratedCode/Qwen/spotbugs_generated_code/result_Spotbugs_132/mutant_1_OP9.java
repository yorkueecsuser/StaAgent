import java.util.Arrays;

class ArrayToStringBug {

    // Method to demonstrate the bug
    public String showBug(int[] array) {
        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));

        // Added mutant code: Equivalent Loop Replacement (though no loop exists, we add a do-while loop that does nothing)
        int i = 0;
        do {
            // This loop does nothing and is just a placeholder for mutation
        } while (i < 0); // Condition is always false, so the loop never executes
    }
}