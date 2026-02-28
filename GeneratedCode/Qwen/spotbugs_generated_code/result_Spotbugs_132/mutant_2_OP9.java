import java.util.Arrays;

class ArrayToStringBug {

    // Method to demonstrate the bug
    public String showBug(int[] array) {
        // Introduced loop that does not change functionality
        int i = 0;
        while (i < array.length) {
            i++;
        }
        
        // Equivalent do-while loop
        int j = 0;
        do {
            j++;
        } while (j < array.length);

        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
    }
}