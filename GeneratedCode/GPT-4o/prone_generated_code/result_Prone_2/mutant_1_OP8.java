import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }
    
    // Mutant code starts here
    public boolean showBugMutant(int[] x, int[] y) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(x, y); // BUG: ArrayEquals
    }
    // Mutant code ends here

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // Demonstrates the bug
        boolean result = checker.showBug(array1, array2);
        System.out.println("Are arrays equal? " + result);
        
        // Demonstrates the mutant code
        boolean mutantResult = checker.showBugMutant(array1, array2);
        System.out.println("Are arrays equal in mutant? " + mutantResult);
    }
}