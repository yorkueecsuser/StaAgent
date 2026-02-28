import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }

    // Mutant method with renamed variable
    public boolean showBugWithRenaming(int[] a, int[] b) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(a, b); // BUG: ArrayEquals
    }

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // Demonstrates the bug
        boolean result = checker.showBug(array1, array2);
        System.out.println("Are arrays equal? " + result);
        
        // Demonstrates the bug with renamed variables
        boolean renamedResult = checker.showBugWithRenaming(array1, array2);
        System.out.println("Are arrays equal with renamed variables? " + renamedResult);
    }
}