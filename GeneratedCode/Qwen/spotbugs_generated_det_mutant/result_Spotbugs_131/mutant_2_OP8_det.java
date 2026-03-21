import java.util.Arrays;

class ArrayHashcodeBug {

    // Method to demonstrate the bug
    public int showBug(int[] array) {
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }

    public static void main(String[] args) {
        ArrayHashcodeBug bugDemo = new ArrayHashcodeBug();
        int[] xhqjehxv = {1, 2, 3};
        System.out.println("Incorrect HashCode: " + bugDemo.showBug(xhqjehxv));
        System.out.println("Correct HashCode: " + Arrays.hashCode(xhqjehxv));
    }
}