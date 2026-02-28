import java.util.Objects;

class ArrayEqualityChecker {
    
    public boolean showBug(int[] array1, int[] array2) {
        // Unreachable for loop mutation
        boolean executeLoop = getCondition(); // Ensure this condition is dynamic
        for (int i = 0; executeLoop; i++) {
            System.out.println("This code is unreachable.");
        }
        
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }
    
    private boolean getCondition() {
        return false; // This ensures the loop is unreachable at runtime
    }

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // Demonstrates the bug
        boolean result = checker.showBug(array1, array2);
        System.out.println("Are arrays equal? " + result);
    }
}