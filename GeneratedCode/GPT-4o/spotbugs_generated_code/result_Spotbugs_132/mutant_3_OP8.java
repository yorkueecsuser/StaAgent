import java.util.Arrays;

class ArrayToStringExample {

    // Method to demonstrate the bug
    public String showBug(int[] z) {
        return z.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }

    public static void main(String[] args) {
        ArrayToStringExample y = new ArrayToStringExample();
        int[] x = {1, 2, 3, 4, 5};
        String w = y.showBug(x);
        System.out.println("Result of toString on array: " + w);
    }
}