import java.util.Arrays;

class ArrayHashcodeBug {

    // Method to demonstrate the bug
    public int showBug(int[] array) {
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This will never be printed");
        }
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayHashcodeBug bugDemo = new ArrayHashcodeBug();
        int[] sampleArray = {1, 2, 3};
        System.out.println("Incorrect HashCode: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct HashCode: " + Arrays.hashCode(sampleArray));
    }
}