import java.util.Arrays;

interface BuggyInterface {
    // Mutable object defined as a final static field in an interface
    final static int[] mutableArray = {1, 2, 3, 4, 5}; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class DemonstrateBug implements BuggyInterface {

    // This method demonstrates the bug by modifying the mutableArray
    public int[] showBug(int[] newValues) {
        boolean condition = getCondition(); // Using a method to determine the condition
        if (condition) {
            System.out.println("This is an unreachable if statement.");
        }
        // Modify the mutable array through the interface
        System.arraycopy(newValues, 0, mutableArray, 0, newValues.length);
        return mutableArray;
    }
    
    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DemonstrateBug demo = new DemonstrateBug();
        int[] newValues = {9, 8, 7, 6, 5};
        int[] result = demo.showBug(newValues);
        System.out.println("Modified Array: " + Arrays.toString(result));
    }
}