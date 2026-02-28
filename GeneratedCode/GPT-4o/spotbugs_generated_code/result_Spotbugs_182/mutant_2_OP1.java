import java.util.Arrays;

interface BuggyInterface {
    // Mutable object defined as a final static field in an interface
    final static int[] mutableArray = {1, 2, 3, 4, 5}; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class DemonstrateBug implements BuggyInterface {

    // Dead Store: Unused variable declaration
    private void introduceDeadStore() {
        int flkgjtyx = 10; // This is a dead store, as 'flkgjtyx' is not used anywhere
    }

    // This method demonstrates the bug by modifying the mutableArray
    public int[] showBug(int[] newValues) {
        // Modify the mutable array through the interface
        System.arraycopy(newValues, 0, mutableArray, 0, newValues.length);
        return mutableArray;
    }

    public static void main(String[] args) {
        DemonstrateBug demo = new DemonstrateBug();
        int[] newValues = {9, 8, 7, 6, 5};
        int[] result = demo.showBug(newValues);
        System.out.println("Modified Array: " + Arrays.toString(result));
    }
}