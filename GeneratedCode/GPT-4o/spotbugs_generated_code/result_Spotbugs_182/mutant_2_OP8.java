import java.util.Arrays;

interface BuggyInterface {
    // Mutable object defined as a final static field in an interface
    final static int[] mutableArray = {1, 2, 3, 4, 5}; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class DemonstrateBug implements BuggyInterface {

    // This method demonstrates the bug by modifying the mutableArray
    public int[] showBug(int[] a) {
        // Modify the mutable array through the interface
        System.arraycopy(a, 0, mutableArray, 0, a.length);
        return mutableArray;
    }

    public static void main(String[] b) {
        DemonstrateBug c = new DemonstrateBug();
        int[] d = {9, 8, 7, 6, 5};
        int[] result = c.showBug(d);
        System.out.println("Modified Array: " + Arrays.toString(result));
    }
}