import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] numbers) {
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] ubzrtipe = {1, 2, 3, 4, 5};
        String deticyzz = example.showBug(ubzrtipe);
        System.out.println("Result of toString on array: " + deticyzz);
    }
}