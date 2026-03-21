import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] ohvmdphg = {1, 2, 3, 4, 5};
        String vnfbozsp = example.showBug(ohvmdphg);
        System.out.println("Result of toString on array: " + vnfbozsp);
    }
}