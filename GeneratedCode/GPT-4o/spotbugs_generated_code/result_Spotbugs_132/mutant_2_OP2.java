import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = example.showBug(sampleArray);
        System.out.println("Result of toString on array: " + result);

        // Duplicated code as per the mutation operator 'Duplication'
        int[] duplicatedArray = {1, 2, 3, 4, 5}; // Assignment statement without method invocation
        int[] duplicatedArrayCopy = duplicatedArray; // Duplicate the assignment statement

        System.out.println("Duplicated array reference: " + Arrays.toString(duplicatedArrayCopy));
    }
}